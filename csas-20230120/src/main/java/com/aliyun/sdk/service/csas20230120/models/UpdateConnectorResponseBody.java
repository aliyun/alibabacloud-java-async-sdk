// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateConnectorResponseBody</p>
 */
public class UpdateConnectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connector")
    private Connector connector;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateConnectorResponseBody(Builder builder) {
        this.connector = builder.connector;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnectorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connector
     */
    public Connector getConnector() {
        return this.connector;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Connector connector; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateConnectorResponseBody model) {
            this.connector = model.connector;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Connector。</p>
         */
        public Builder connector(Connector connector) {
            this.connector = connector;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateConnectorResponseBody build() {
            return new UpdateConnectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConnectorResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateConnectorResponseBody</p>
     */
    public static class UpgradeTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private UpgradeTime(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeTime create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            private Builder() {
            } 

            private Builder(UpgradeTime model) {
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>23:00</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>20:00</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public UpgradeTime build() {
                return new UpgradeTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateConnectorResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateConnectorResponseBody</p>
     */
    public static class Connector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateStatus")
        private String accelerateStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SwitchStatus")
        private String switchStatus;

        @com.aliyun.core.annotation.NameInMap("UpgradeTime")
        private UpgradeTime upgradeTime;

        @com.aliyun.core.annotation.NameInMap("VipCidr")
        private String vipCidr;

        private Connector(Builder builder) {
            this.accelerateStatus = builder.accelerateStatus;
            this.connectorId = builder.connectorId;
            this.createTime = builder.createTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.switchStatus = builder.switchStatus;
            this.upgradeTime = builder.upgradeTime;
            this.vipCidr = builder.vipCidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connector create() {
            return builder().build();
        }

        /**
         * @return accelerateStatus
         */
        public String getAccelerateStatus() {
            return this.accelerateStatus;
        }

        /**
         * @return connectorId
         */
        public String getConnectorId() {
            return this.connectorId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return switchStatus
         */
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        /**
         * @return upgradeTime
         */
        public UpgradeTime getUpgradeTime() {
            return this.upgradeTime;
        }

        /**
         * @return vipCidr
         */
        public String getVipCidr() {
            return this.vipCidr;
        }

        public static final class Builder {
            private String accelerateStatus; 
            private String connectorId; 
            private String createTime; 
            private String name; 
            private String regionId; 
            private String status; 
            private String switchStatus; 
            private UpgradeTime upgradeTime; 
            private String vipCidr; 

            private Builder() {
            } 

            private Builder(Connector model) {
                this.accelerateStatus = model.accelerateStatus;
                this.connectorId = model.connectorId;
                this.createTime = model.createTime;
                this.name = model.name;
                this.regionId = model.regionId;
                this.status = model.status;
                this.switchStatus = model.switchStatus;
                this.upgradeTime = model.upgradeTime;
                this.vipCidr = model.vipCidr;
            } 

            /**
             * <p>Specifies whether to enable Global Accelerator. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder accelerateStatus(String accelerateStatus) {
                this.accelerateStatus = accelerateStatus;
                return this;
            }

            /**
             * <p>ConnectorID。</p>
             * 
             * <strong>example:</strong>
             * <p>connector-94db94e06b98****</p>
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * <p>The creation time of the Connector.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-16 17:18:46</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The Connector name.</p>
             * 
             * <strong>example:</strong>
             * <p>connector_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The connection status of the Connector. Valid values:</p>
             * <ul>
             * <li><strong>Online</strong>: Online.</li>
             * <li><strong>Offline</strong>: Offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The instance status of the Connector. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Shutdown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder switchStatus(String switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            /**
             * <p>The upgrade time of the Connector.</p>
             */
            public Builder upgradeTime(UpgradeTime upgradeTime) {
                this.upgradeTime = upgradeTime;
                return this;
            }

            /**
             * <p>The virtual IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder vipCidr(String vipCidr) {
                this.vipCidr = vipCidr;
                return this;
            }

            public Connector build() {
                return new Connector(this);
            } 

        } 

    }
}
