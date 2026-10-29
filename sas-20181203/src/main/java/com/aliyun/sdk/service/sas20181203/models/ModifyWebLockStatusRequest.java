// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyWebLockStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockStatusRequest</p>
 */
public class ModifyWebLockStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private ModifyWebLockStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockStatusRequest create() {
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ModifyWebLockStatusRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private String status; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebLockStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
            this.uuid = request.uuid;
        } 

        /**
         * <p>Specifies the language of the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>125.71.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Specifies the protection status of the server. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enables protection.</li>
         * <li><strong>off</strong>: Initiates a shutdown of protection.</li>
         * </ul>
         * <blockquote>
         * <p>After you initiate a shutdown of web tamper-proofing for the current server, a tamper-proofing authorization quota is released.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The UUID of the server for which you want to modify the protection status against brute-force attacks.
         * You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUID of the server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inet-1234567****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyWebLockStatusRequest build() {
            return new ModifyWebLockStatusRequest(this);
        } 

    } 

}
