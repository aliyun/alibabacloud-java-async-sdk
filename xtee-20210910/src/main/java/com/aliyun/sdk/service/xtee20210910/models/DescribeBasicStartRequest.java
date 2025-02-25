// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBasicStartRequest} extends {@link RequestModel}
 *
 * <p>DescribeBasicStartRequest</p>
 */
public class DescribeBasicStartRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDs")
    private String endDs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("service")
    private String service;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDs")
    private String startDs;

    private DescribeBasicStartRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.endDs = builder.endDs;
        this.regId = builder.regId;
        this.service = builder.service;
        this.startDs = builder.startDs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBasicStartRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return endDs
     */
    public String getEndDs() {
        return this.endDs;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return startDs
     */
    public String getStartDs() {
        return this.startDs;
    }

    public static final class Builder extends Request.Builder<DescribeBasicStartRequest, Builder> {
        private String appKey; 
        private String endDs; 
        private String regId; 
        private String service; 
        private String startDs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBasicStartRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.endDs = request.endDs;
            this.regId = request.regId;
            this.service = request.service;
            this.startDs = request.startDs;
        } 

        /**
         * appKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("appKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * endDs.
         */
        public Builder endDs(String endDs) {
            this.putQueryParameter("endDs", endDs);
            this.endDs = endDs;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * service.
         */
        public Builder service(String service) {
            this.putQueryParameter("service", service);
            this.service = service;
            return this;
        }

        /**
         * startDs.
         */
        public Builder startDs(String startDs) {
            this.putQueryParameter("startDs", startDs);
            this.startDs = startDs;
            return this;
        }

        @Override
        public DescribeBasicStartRequest build() {
            return new DescribeBasicStartRequest(this);
        } 

    } 

}
