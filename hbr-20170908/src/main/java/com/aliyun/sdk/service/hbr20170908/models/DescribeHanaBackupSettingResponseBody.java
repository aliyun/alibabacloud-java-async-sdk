// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHanaBackupSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaBackupSettingResponseBody</p>
 */
public class DescribeHanaBackupSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HanaBackupSetting")
    private HanaBackupSetting hanaBackupSetting;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeHanaBackupSettingResponseBody(Builder builder) {
        this.code = builder.code;
        this.hanaBackupSetting = builder.hanaBackupSetting;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaBackupSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hanaBackupSetting
     */
    public HanaBackupSetting getHanaBackupSetting() {
        return this.hanaBackupSetting;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private HanaBackupSetting hanaBackupSetting; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The backup settings.</p>
         */
        public Builder hanaBackupSetting(HanaBackupSetting hanaBackupSetting) {
            this.hanaBackupSetting = hanaBackupSetting;
            return this;
        }

        /**
         * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9D0DB5BC-5071-5ADF-BCD1-14EBB0C17C54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeHanaBackupSettingResponseBody build() {
            return new DescribeHanaBackupSettingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHanaBackupSettingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaBackupSettingResponseBody</p>
     */
    public static class HanaBackupSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatalogBackupParameterFile")
        private String catalogBackupParameterFile;

        @com.aliyun.core.annotation.NameInMap("CatalogBackupUsingBackint")
        private Boolean catalogBackupUsingBackint;

        @com.aliyun.core.annotation.NameInMap("DataBackupParameterFile")
        private String dataBackupParameterFile;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EnableAutoLogBackup")
        private Boolean enableAutoLogBackup;

        @com.aliyun.core.annotation.NameInMap("LogBackupParameterFile")
        private String logBackupParameterFile;

        @com.aliyun.core.annotation.NameInMap("LogBackupTimeout")
        private Long logBackupTimeout;

        @com.aliyun.core.annotation.NameInMap("LogBackupUsingBackint")
        private Boolean logBackupUsingBackint;

        private HanaBackupSetting(Builder builder) {
            this.catalogBackupParameterFile = builder.catalogBackupParameterFile;
            this.catalogBackupUsingBackint = builder.catalogBackupUsingBackint;
            this.dataBackupParameterFile = builder.dataBackupParameterFile;
            this.databaseName = builder.databaseName;
            this.enableAutoLogBackup = builder.enableAutoLogBackup;
            this.logBackupParameterFile = builder.logBackupParameterFile;
            this.logBackupTimeout = builder.logBackupTimeout;
            this.logBackupUsingBackint = builder.logBackupUsingBackint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaBackupSetting create() {
            return builder().build();
        }

        /**
         * @return catalogBackupParameterFile
         */
        public String getCatalogBackupParameterFile() {
            return this.catalogBackupParameterFile;
        }

        /**
         * @return catalogBackupUsingBackint
         */
        public Boolean getCatalogBackupUsingBackint() {
            return this.catalogBackupUsingBackint;
        }

        /**
         * @return dataBackupParameterFile
         */
        public String getDataBackupParameterFile() {
            return this.dataBackupParameterFile;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return enableAutoLogBackup
         */
        public Boolean getEnableAutoLogBackup() {
            return this.enableAutoLogBackup;
        }

        /**
         * @return logBackupParameterFile
         */
        public String getLogBackupParameterFile() {
            return this.logBackupParameterFile;
        }

        /**
         * @return logBackupTimeout
         */
        public Long getLogBackupTimeout() {
            return this.logBackupTimeout;
        }

        /**
         * @return logBackupUsingBackint
         */
        public Boolean getLogBackupUsingBackint() {
            return this.logBackupUsingBackint;
        }

        public static final class Builder {
            private String catalogBackupParameterFile; 
            private Boolean catalogBackupUsingBackint; 
            private String dataBackupParameterFile; 
            private String databaseName; 
            private Boolean enableAutoLogBackup; 
            private String logBackupParameterFile; 
            private Long logBackupTimeout; 
            private Boolean logBackupUsingBackint; 

            /**
             * <p>The configuration file for catalog backup.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
             */
            public Builder catalogBackupParameterFile(String catalogBackupParameterFile) {
                this.catalogBackupParameterFile = catalogBackupParameterFile;
                return this;
            }

            /**
             * <p>Indicates whether Backint is used to back up catalogs. Valid values:</p>
             * <ul>
             * <li>true: Backint is used to back up catalogs.</li>
             * <li>false: Backint is not used to back up catalogs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder catalogBackupUsingBackint(Boolean catalogBackupUsingBackint) {
                this.catalogBackupUsingBackint = catalogBackupUsingBackint;
                return this;
            }

            /**
             * <p>The configuration file for data backup.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
             */
            public Builder dataBackupParameterFile(String dataBackupParameterFile) {
                this.dataBackupParameterFile = dataBackupParameterFile;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEMDB</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>Indicates whether automatic log backup is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Automatic log backup is enabled.</li>
             * <li><strong>false</strong>: Automatic log backup is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAutoLogBackup(Boolean enableAutoLogBackup) {
                this.enableAutoLogBackup = enableAutoLogBackup;
                return this;
            }

            /**
             * <p>The configuration file for log backup.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
             */
            public Builder logBackupParameterFile(String logBackupParameterFile) {
                this.logBackupParameterFile = logBackupParameterFile;
                return this;
            }

            /**
             * <p>The interval at which logs are backed up. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder logBackupTimeout(Long logBackupTimeout) {
                this.logBackupTimeout = logBackupTimeout;
                return this;
            }

            /**
             * <p>Indicates whether Backint is used to back up logs. Valid values:</p>
             * <ul>
             * <li>true: Backint is used to back up logs.</li>
             * <li>false: Backint is not used to back up logs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logBackupUsingBackint(Boolean logBackupUsingBackint) {
                this.logBackupUsingBackint = logBackupUsingBackint;
                return this;
            }

            public HanaBackupSetting build() {
                return new HanaBackupSetting(this);
            } 

        } 

    }
}
