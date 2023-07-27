// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterAccessWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterAccessWhiteListRequest</p>
 */
public class ModifyClusterAccessWhiteListRequest extends Request {
    @Query
    @NameInMap("DBClusterIPArrayAttribute")
    private String DBClusterIPArrayAttribute;

    @Query
    @NameInMap("DBClusterIPArrayName")
    private String DBClusterIPArrayName;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ModifyMode")
    private String modifyMode;

    @Query
    @NameInMap("SecurityIps")
    @Validation(required = true)
    private String securityIps;

    private ModifyClusterAccessWhiteListRequest(Builder builder) {
        super(builder);
        this.DBClusterIPArrayAttribute = builder.DBClusterIPArrayAttribute;
        this.DBClusterIPArrayName = builder.DBClusterIPArrayName;
        this.DBClusterId = builder.DBClusterId;
        this.modifyMode = builder.modifyMode;
        this.securityIps = builder.securityIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterAccessWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterIPArrayAttribute
     */
    public String getDBClusterIPArrayAttribute() {
        return this.DBClusterIPArrayAttribute;
    }

    /**
     * @return DBClusterIPArrayName
     */
    public String getDBClusterIPArrayName() {
        return this.DBClusterIPArrayName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    public static final class Builder extends Request.Builder<ModifyClusterAccessWhiteListRequest, Builder> {
        private String DBClusterIPArrayAttribute; 
        private String DBClusterIPArrayName; 
        private String DBClusterId; 
        private String modifyMode; 
        private String securityIps; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterAccessWhiteListRequest request) {
            super(request);
            this.DBClusterIPArrayAttribute = request.DBClusterIPArrayAttribute;
            this.DBClusterIPArrayName = request.DBClusterIPArrayName;
            this.DBClusterId = request.DBClusterId;
            this.modifyMode = request.modifyMode;
            this.securityIps = request.securityIps;
        } 

        /**
         * The attribute of the IP address whitelist. By default, this parameter is empty.
         * <p>
         * 
         * > Whitelists with the hidden attribute are not displayed in the console. Those whitelists are used to access Data Transmission Service (DTS) and PolarDB.
         */
        public Builder DBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
            this.putQueryParameter("DBClusterIPArrayAttribute", DBClusterIPArrayAttribute);
            this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
            return this;
        }

        /**
         * The name of the IP address whitelist. If you do not specify this parameter, the Default whitelist is modified.
         * <p>
         * 
         * *   The whitelist name must be 2 to 32 characters in length. The name can contain lowercase letters, digits, and underscores (\_). The name must start with a lowercase letter and end with a lowercase letter or a digit.
         * *   Each cluster supports up to 50 IP address whitelists.
         */
        public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
            this.putQueryParameter("DBClusterIPArrayName", DBClusterIPArrayName);
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The method used to modify the IP address whitelist. Valid values:
         * <p>
         * 
         * *   **Cover** (default)
         * *   **Append**
         * *   **Delete**
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * The IP addresses in an IP address whitelist of a cluster. Separate multiple IP addresses with commas (,). You can add a maximum of 500 different IP addresses to a whitelist. The entries in the IP address whitelist must be in one of the following formats:
         * <p>
         * 
         * *   IP addresses, such as 10.23.XX.XX.
         * *   CIDR blocks, such as 10.23.xx.xx/24. In this example, 24 indicates that the prefix of each IP address in the IP whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.
         */
        public Builder securityIps(String securityIps) {
            this.putQueryParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        @Override
        public ModifyClusterAccessWhiteListRequest build() {
            return new ModifyClusterAccessWhiteListRequest(this);
        } 

    } 

}
