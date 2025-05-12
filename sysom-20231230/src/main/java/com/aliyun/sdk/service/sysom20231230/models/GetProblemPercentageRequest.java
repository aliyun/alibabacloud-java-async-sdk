// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetProblemPercentageRequest} extends {@link RequestModel}
 *
 * <p>GetProblemPercentageRequest</p>
 */
public class GetProblemPercentageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster")
    private String cluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance")
    private String instance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float start;

    private GetProblemPercentageRequest(Builder builder) {
        super(builder);
        this.cluster = builder.cluster;
        this.end = builder.end;
        this.instance = builder.instance;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProblemPercentageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cluster
     */
    public String getCluster() {
        return this.cluster;
    }

    /**
     * @return end
     */
    public Float getEnd() {
        return this.end;
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return start
     */
    public Float getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetProblemPercentageRequest, Builder> {
        private String cluster; 
        private Float end; 
        private String instance; 
        private Float start; 

        private Builder() {
            super();
        } 

        private Builder(GetProblemPercentageRequest request) {
            super(request);
            this.cluster = request.cluster;
            this.end = request.end;
            this.instance = request.instance;
            this.start = request.start;
        } 

        /**
         * cluster.
         */
        public Builder cluster(String cluster) {
            this.putQueryParameter("cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1725801327754</p>
         */
        public Builder end(Float end) {
            this.putQueryParameter("end", end);
            this.end = end;
            return this;
        }

        /**
         * instance.
         */
        public Builder instance(String instance) {
            this.putQueryParameter("instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1725797727754</p>
         */
        public Builder start(Float start) {
            this.putQueryParameter("start", start);
            this.start = start;
            return this;
        }

        @Override
        public GetProblemPercentageRequest build() {
            return new GetProblemPercentageRequest(this);
        } 

    } 

}
