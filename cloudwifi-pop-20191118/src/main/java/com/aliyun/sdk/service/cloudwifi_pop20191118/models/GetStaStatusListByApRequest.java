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
 * {@link GetStaStatusListByApRequest} extends {@link RequestModel}
 *
 * <p>GetStaStatusListByApRequest</p>
 */
public class GetStaStatusListByApRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApMac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apMac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cursor")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private GetStaStatusListByApRequest(Builder builder) {
        super(builder);
        this.apMac = builder.apMac;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.cursor = builder.cursor;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStaStatusListByApRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apMac
     */
    public String getApMac() {
        return this.apMac;
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

    /**
     * @return cursor
     */
    public Long getCursor() {
        return this.cursor;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetStaStatusListByApRequest, Builder> {
        private String apMac; 
        private String appCode; 
        private String appName; 
        private Long cursor; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetStaStatusListByApRequest request) {
            super(request);
            this.apMac = request.apMac;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.cursor = request.cursor;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apMac(String apMac) {
            this.putQueryParameter("ApMac", apMac);
            this.apMac = apMac;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cursor(Long cursor) {
            this.putQueryParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetStaStatusListByApRequest build() {
            return new GetStaStatusListByApRequest(this);
        } 

    } 

}
