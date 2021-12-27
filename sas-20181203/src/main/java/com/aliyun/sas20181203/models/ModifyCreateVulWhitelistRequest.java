// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyCreateVulWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyCreateVulWhitelistRequest</p>
 */
public class ModifyCreateVulWhitelistRequest extends Request {
    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("TargetInfo")
    private String targetInfo;

    @Query
    @NameInMap("Whitelist")
    private String whitelist;


    private ModifyCreateVulWhitelistRequest(Builder builder) {
        super(builder);
        this.reason = builder.reason;
        this.targetInfo = builder.targetInfo;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCreateVulWhitelistRequest create() {
        return builder().build();
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    /**
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String reason; 
        private String targetInfo; 
        private String whitelist; 

        /**
         * <p>Reason.</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>TargetInfo.</p>
         */
        public Builder targetInfo(String targetInfo) {
            this.putQueryParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        /**
         * <p>Whitelist.</p>
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        public ModifyCreateVulWhitelistRequest build() {
            return new ModifyCreateVulWhitelistRequest(this);
        } 

    } 

}
