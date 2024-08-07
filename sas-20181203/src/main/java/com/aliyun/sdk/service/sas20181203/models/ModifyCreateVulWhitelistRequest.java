// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCreateVulWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyCreateVulWhitelistRequest</p>
 */
public class ModifyCreateVulWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInfo")
    private String targetInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    @com.aliyun.core.annotation.Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ModifyCreateVulWhitelistRequest, Builder> {
        private String reason; 
        private String targetInfo; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCreateVulWhitelistRequest request) {
            super(request);
            this.reason = request.reason;
            this.targetInfo = request.targetInfo;
            this.whitelist = request.whitelist;
        } 

        /**
         * The reason why you add the vulnerability to the whitelist.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **type**: the type of the applicable scope. Valid values:
         * 
         *     *   **GroupId**: the ID of a server group
         *     *   **Uuid**: the UUID of a server
         * 
         * *   **uuids**: the UUIDs of servers
         * 
         * *   **groupIds**: the IDs of server groups
         * 
         * >  If you leave this parameter empty, all servers are added to the whitelist. If you set the **type** field to **GroupId**, you must also specify the **groupIds** field. If you set **type** to **Uuid**, you must specify the **uuids** parameter.
         */
        public Builder targetInfo(String targetInfo) {
            this.putQueryParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        /**
         * The information about the vulnerability that you want to add to the whitelist. The value is a JSON string that contains the following fields:
         * <p>
         * 
         * *   **Status**: the status of the vulnerability.
         * 
         * *   **GmtLast**: the timestamp when the vulnerability was last detected. Unit: milliseconds.
         * 
         * *   **LaterCount**: the number of vulnerabilities that have the medium priority.
         * 
         * *   **AsapCount**: the number of vulnerabilities that have the high priority.
         * 
         * *   **Name**: the name of the vulnerability.
         * 
         * *   **Type**: the type of the vulnerability. Valid values:
         * 
         *     *   **cve**: Linux software vulnerability
         *     *   **sys**: Windows system vulnerability
         *     *   **cms**: Web-CMS vulnerability
         *     *   **app**: application vulnerability
         *     *   **emg**: urgent vulnerability
         * 
         * *   **Related**: the Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.
         * 
         * *   **HandledCount**: the number of handled vulnerabilities.
         * 
         * *   **AliasName**: the alias of the vulnerability.
         * 
         * *   **RuleModifyTime**: the time when the vulnerability was last disclosed.
         * 
         * *   **NntfCount**: the number of vulnerabilities that have the low priority.
         * 
         * *   **TotalFixCount**: the total number of fixed vulnerabilities.
         * 
         * *   **Tags**: the tag that is added to the vulnerability.
         * 
         * >  You can call the [DescribeGroupedVul](~~DescribeGroupedVul~~) operation to query the information about the vulnerability that you want to add to the whitelist.
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public ModifyCreateVulWhitelistRequest build() {
            return new ModifyCreateVulWhitelistRequest(this);
        } 

    } 

}
