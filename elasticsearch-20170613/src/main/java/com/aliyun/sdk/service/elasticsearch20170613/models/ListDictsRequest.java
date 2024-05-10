// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDictsRequest} extends {@link RequestModel}
 *
 * <p>ListDictsRequest</p>
 */
public class ListDictsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("analyzerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String analyzerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
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
         * The ID of the cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the dictionary. Valid values:
         * <p>
         * 
         * *   IK: IK dictionary after a standard update
         * *   IK_HOT: IK dictionary after a rolling update
         * *   SYNONYMS: synonym dictionary
         * *   ALIWS: Alibaba Cloud dictionary
         */
        public Builder analyzerType(String analyzerType) {
            this.putQueryParameter("analyzerType", analyzerType);
            this.analyzerType = analyzerType;
            return this;
        }

        /**
         * The name of the dictionary file.
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
