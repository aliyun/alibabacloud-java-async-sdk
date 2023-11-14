// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOperateVulRequest} extends {@link RequestModel}
 *
 * <p>ModifyOperateVulRequest</p>
 */
public class ModifyOperateVulRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("Info")
    @Validation(required = true)
    private String info;

    @Query
    @NameInMap("OperateType")
    @Validation(required = true)
    private String operateType;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ModifyOperateVulRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.info = builder.info;
        this.operateType = builder.operateType;
        this.reason = builder.reason;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOperateVulRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyOperateVulRequest, Builder> {
        private String from; 
        private String info; 
        private String operateType; 
        private String reason; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOperateVulRequest request) {
            super(request);
            this.from = request.from;
            this.info = request.info;
            this.operateType = request.operateType;
            this.reason = request.reason;
            this.type = request.type;
        } 

        /**
         * The request ID. Set the value to **sas**.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The details of the vulnerability. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **name**: the name of the vulnerability.
         * 
         * *   **uuid**: the UUID of the server on which the vulnerability is detected.
         * 
         * *   **tag**: the tag that is added to the vulnerability. Valid values:
         * 
         *     *   **oval**: Linux software vulnerability
         *     *   **system**: Windows system vulnerability
         *     *   **cms**: Web-CMS vulnerability
         * 
         * >  You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the tags that are added to vulnerabilities of other types.
         * 
         * *   **isFront**: specifies whether a pre-patch is required to fix the Windows system vulnerability. This field is required only for Windows system vulnerabilities. Valid values:
         * 
         *     *   **0**: no
         *     *   **1**: yes
         * 
         * >  You can fix multiple vulnerabilities at a time. Separate the details of multiple vulnerabilities with commas (,). You can call the [DescribeVulLIst](~~DescribeVulList~~) operation to query the details of vulnerabilities.
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
        }

        /**
         * The operation that you want to perform on the vulnerability. Valid values:
         * <p>
         * 
         * *   **vul_fix**: fixes the vulnerability.
         * *   **vul_verify**: verifies the vulnerability fix.
         * *   **vul_ignore**: ignores the vulnerability.
         * *   **vul\_undo_ignore**: cancels ignoring the vulnerability.
         * *   **vul_delete**: deletes the vulnerability.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * The reason why the vulnerability is **ignored**.
         * <p>
         * 
         * >  This parameter is required only when you set **OperateType** to **vul_ignore**.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The type of the vulnerability. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerability
         * *   **sys**: Windows system vulnerability
         * *   **cms**: Web-CMS vulnerability
         * *   **emg**: urgent vulnerability
         * *   **app**: application vulnerability
         * *   **sca**: vulnerability that is detected based on software component analysis
         * 
         * >  You cannot fix the urgent vulnerabilities, application vulnerabilities, or vulnerabilities that are detected based on software component analysis.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyOperateVulRequest build() {
            return new ModifyOperateVulRequest(this);
        } 

    } 

}
