// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeDataTopRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeDataTopRequest</p>
 */
public class GetQueryOptimizeDataTopRequest extends Request {
    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("TagNames")
    private String tagNames;

    @Query
    @NameInMap("Time")
    @Validation(required = true)
    private String time;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private GetQueryOptimizeDataTopRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.instanceIds = builder.instanceIds;
        this.tagNames = builder.tagNames;
        this.time = builder.time;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeDataTopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return tagNames
     */
    public String getTagNames() {
        return this.tagNames;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeDataTopRequest, Builder> {
        private String engine; 
        private String instanceIds; 
        private String tagNames; 
        private String time; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeDataTopRequest response) {
            super(response);
            this.engine = response.engine;
            this.instanceIds = response.instanceIds;
            this.tagNames = response.tagNames;
            this.time = response.time;
            this.type = response.type;
        } 

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * TagNames.
         */
        public Builder tagNames(String tagNames) {
            this.putQueryParameter("TagNames", tagNames);
            this.tagNames = tagNames;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetQueryOptimizeDataTopRequest build() {
            return new GetQueryOptimizeDataTopRequest(this);
        } 

    } 

}
