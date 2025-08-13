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
 * {@link DescribeSDKDownloadListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSDKDownloadListRequest</p>
 */
public class DescribeSDKDownloadListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deviceType")
    private String deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("listType")
    private String listType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeSDKDownloadListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.deviceType = builder.deviceType;
        this.listType = builder.listType;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDKDownloadListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeSDKDownloadListRequest, Builder> {
        private String lang; 
        private String deviceType; 
        private String listType; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSDKDownloadListRequest request) {
            super(request);
            this.lang = request.lang;
            this.deviceType = request.deviceType;
            this.listType = request.listType;
            this.regId = request.regId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Device type.</p>
         * 
         * <strong>example:</strong>
         * <p>ANDROID</p>
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("deviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>Download type</p>
         * 
         * <strong>example:</strong>
         * <p>OLD</p>
         */
        public Builder listType(String listType) {
            this.putQueryParameter("listType", listType);
            this.listType = listType;
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

        @Override
        public DescribeSDKDownloadListRequest build() {
            return new DescribeSDKDownloadListRequest(this);
        } 

    } 

}
