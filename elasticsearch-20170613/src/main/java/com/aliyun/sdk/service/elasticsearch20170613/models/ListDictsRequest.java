// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDictsRequest} extends {@link RequestModel}
 *
 * <p>ListDictsRequest</p>
 */
public class ListDictsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("analyzerType")
    @Validation(required = true)
    private String analyzerType;

    @Query
    @NameInMap("name")
    private String name;

    private ListDictsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.analyzerType = builder.analyzerType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDictsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return analyzerType
     */
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ListDictsRequest, Builder> {
        private String instanceId; 
        private String analyzerType; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ListDictsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.analyzerType = request.analyzerType;
            this.name = request.name;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * analyzerType.
         */
        public Builder analyzerType(String analyzerType) {
            this.putQueryParameter("analyzerType", analyzerType);
            this.analyzerType = analyzerType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public ListDictsRequest build() {
            return new ListDictsRequest(this);
        } 

    } 

}
