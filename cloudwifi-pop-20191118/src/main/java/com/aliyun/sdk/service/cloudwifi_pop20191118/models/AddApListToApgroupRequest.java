// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link AddApListToApgroupRequest} extends {@link RequestModel}
 *
 * <p>AddApListToApgroupRequest</p>
 */
public class AddApListToApgroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApMacList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> apMacList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    private AddApListToApgroupRequest(Builder builder) {
        super(builder);
        this.apGroupId = builder.apGroupId;
        this.apMacList = builder.apMacList;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddApListToApgroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apGroupId
     */
    public String getApGroupId() {
        return this.apGroupId;
    }

    /**
     * @return apMacList
     */
    public java.util.Map<String, ?> getApMacList() {
        return this.apMacList;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    public static final class Builder extends Request.Builder<AddApListToApgroupRequest, Builder> {
        private String apGroupId; 
        private java.util.Map<String, ?> apMacList; 
        private String appCode; 
        private String appName; 

        private Builder() {
            super();
        } 

        private Builder(AddApListToApgroupRequest request) {
            super(request);
            this.apGroupId = request.apGroupId;
            this.apMacList = request.apMacList;
            this.appCode = request.appCode;
            this.appName = request.appName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apGroupId(String apGroupId) {
            this.putQueryParameter("ApGroupId", apGroupId);
            this.apGroupId = apGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apMacList(java.util.Map<String, ?> apMacList) {
            String apMacListShrink = shrink(apMacList, "ApMacList", "json");
            this.putBodyParameter("ApMacList", apMacListShrink);
            this.apMacList = apMacList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        @Override
        public AddApListToApgroupRequest build() {
            return new AddApListToApgroupRequest(this);
        } 

    } 

}
