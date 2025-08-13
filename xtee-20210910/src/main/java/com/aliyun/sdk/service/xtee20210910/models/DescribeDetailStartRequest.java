// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeDetailStartRequest} extends {@link RequestModel}
 *
 * <p>DescribeDetailStartRequest</p>
 */
public class DescribeDetailStartRequest extends Request {
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

    private DescribeDetailStartRequest(Builder builder) {
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

    public static DescribeDetailStartRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDetailStartRequest, Builder> {
        private String appKey; 
        private String endDs; 
        private String regId; 
        private String service; 
        private String startDs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDetailStartRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.endDs = request.endDs;
            this.regId = request.regId;
            this.service = request.service;
            this.startDs = request.startDs;
        } 

        /**
         * <p>Application appkey.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("appKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>End time</p>
         * <p>Format yyyymmdd</p>
         * 
         * <strong>example:</strong>
         * <p>20250320</p>
         */
        public Builder endDs(String endDs) {
            this.putQueryParameter("endDs", endDs);
            this.endDs = endDs;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Called service</p>
         * 
         * <strong>example:</strong>
         * <p>service_tender_cee</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("service", service);
            this.service = service;
            return this;
        }

        /**
         * <p>Start time</p>
         * <p> Format yyyymmdd</p>
         * 
         * <strong>example:</strong>
         * <p>20250310</p>
         */
        public Builder startDs(String startDs) {
            this.putQueryParameter("startDs", startDs);
            this.startDs = startDs;
            return this;
        }

        @Override
        public DescribeDetailStartRequest build() {
            return new DescribeDetailStartRequest(this);
        } 

    } 

}
