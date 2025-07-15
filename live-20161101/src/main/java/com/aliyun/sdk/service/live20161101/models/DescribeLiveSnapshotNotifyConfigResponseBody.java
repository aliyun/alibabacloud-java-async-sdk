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
 * {@link DescribeLiveSnapshotNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveSnapshotNotifyConfigResponseBody</p>
 */
public class DescribeLiveSnapshotNotifyConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("NotifyAuthKey")
    private String notifyAuthKey;

    @com.aliyun.core.annotation.NameInMap("NotifyReqAuth")
    private String notifyReqAuth;

    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    private String notifyUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveSnapshotNotifyConfigResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.notifyAuthKey = builder.notifyAuthKey;
        this.notifyReqAuth = builder.notifyReqAuth;
        this.notifyUrl = builder.notifyUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveSnapshotNotifyConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return notifyAuthKey
     */
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    /**
     * @return notifyReqAuth
     */
    public String getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domainName; 
        private String notifyAuthKey; 
        private String notifyReqAuth; 
        private String notifyUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveSnapshotNotifyConfigResponseBody model) {
            this.domainName = model.domainName;
            this.notifyAuthKey = model.notifyAuthKey;
            this.notifyReqAuth = model.notifyReqAuth;
            this.notifyUrl = model.notifyUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.yourdomain***.com">www.yourdomain***.com</a></p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The callback authentication key.</p>
         * 
         * <strong>example:</strong>
         * <p>yourkey</p>
         */
        public Builder notifyAuthKey(String notifyAuthKey) {
            this.notifyAuthKey = notifyAuthKey;
            return this;
        }

        /**
         * <p>Indicates whether callback authentication is enabled. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: Callback authentication is enabled.</li>
         * <li><strong>no</strong>: Callback authentication is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder notifyReqAuth(String notifyReqAuth) {
            this.notifyReqAuth = notifyReqAuth;
            return this;
        }

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://callback.yourdomain***.com">http://callback.yourdomain***.com</a></p>
         */
        public Builder notifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5056369B-D337-499E-B8B7-B761BD37B08A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveSnapshotNotifyConfigResponseBody build() {
            return new DescribeLiveSnapshotNotifyConfigResponseBody(this);
        } 

    } 

}
