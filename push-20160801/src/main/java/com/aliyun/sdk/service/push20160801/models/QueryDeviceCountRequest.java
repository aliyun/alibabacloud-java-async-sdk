// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceCountRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceCountRequest</p>
 */
public class QueryDeviceCountRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true, maximum = 999999999)
    private Long appKey;

    @Query
    @NameInMap("Target")
    @Validation(required = true)
    private String target;

    @Query
    @NameInMap("TargetValue")
    @Validation(required = true)
    private String targetValue;

    private QueryDeviceCountRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.target = builder.target;
        this.targetValue = builder.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return targetValue
     */
    public String getTargetValue() {
        return this.targetValue;
    }

    public static final class Builder extends Request.Builder<QueryDeviceCountRequest, Builder> {
        private Long appKey; 
        private String target; 
        private String targetValue; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceCountRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.target = response.target;
            this.targetValue = response.targetValue;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * TargetValue.
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        @Override
        public QueryDeviceCountRequest build() {
            return new QueryDeviceCountRequest(this);
        } 

    } 

}
