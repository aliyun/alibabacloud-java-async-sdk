// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeDataTrendRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeDataTrendRequest</p>
 */
public class GetQueryOptimizeDataTrendRequest extends Request {
    @Query
    @NameInMap("End")
    @Validation(required = true)
    private String end;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Start")
    @Validation(required = true)
    private String start;

    @Query
    @NameInMap("TagNames")
    private String tagNames;

    private GetQueryOptimizeDataTrendRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.engine = builder.engine;
        this.instanceIds = builder.instanceIds;
        this.start = builder.start;
        this.tagNames = builder.tagNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeDataTrendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
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
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    /**
     * @return tagNames
     */
    public String getTagNames() {
        return this.tagNames;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeDataTrendRequest, Builder> {
        private String end; 
        private String engine; 
        private String instanceIds; 
        private String start; 
        private String tagNames; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeDataTrendRequest response) {
            super(response);
            this.end = response.end;
            this.engine = response.engine;
            this.instanceIds = response.instanceIds;
            this.start = response.start;
            this.tagNames = response.tagNames;
        } 

        /**
         * End.
         */
        public Builder end(String end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
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
         * Start.
         */
        public Builder start(String start) {
            this.putQueryParameter("Start", start);
            this.start = start;
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

        @Override
        public GetQueryOptimizeDataTrendRequest build() {
            return new GetQueryOptimizeDataTrendRequest(this);
        } 

    } 

}
