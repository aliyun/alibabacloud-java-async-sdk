// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveMessageAppRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveMessageAppRequest</p>
 */
public class DescribeLiveMessageAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    private DescribeLiveMessageAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveMessageAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    public static final class Builder extends Request.Builder<DescribeLiveMessageAppRequest, Builder> {
        private String appId; 
        private String dataCenter; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveMessageAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
        } 

        /**
         * <p>The ID of the interactive messaging application to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putQueryParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        @Override
        public DescribeLiveMessageAppRequest build() {
            return new DescribeLiveMessageAppRequest(this);
        } 

    } 

}
