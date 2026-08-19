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
 * {@link CreateConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConnectorResponseBody</p>
 */
public class CreateConnectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connector")
    private Connector connector;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateConnectorResponseBody(Builder builder) {
        this.connector = builder.connector;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectorResponseBody create() {
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

        private Builder(CreateConnectorResponseBody model) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A1367BB2-A5D8-5E79-9403-2446757AC03C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConnectorResponseBody build() {
            return new CreateConnectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateConnectorResponseBody} extends {@link TeaModel}
     *
     * <p>CreateConnectorResponseBody</p>
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
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * Start.
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
     * {@link CreateConnectorResponseBody} extends {@link TeaModel}
     *
     * <p>CreateConnectorResponseBody</p>
     */
    public static class Connector extends TeaModel {
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

        private Connector(Builder builder) {
            this.connectorId = builder.connectorId;
            this.createTime = builder.createTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.switchStatus = builder.switchStatus;
            this.upgradeTime = builder.upgradeTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connector create() {
            return builder().build();
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

        public static final class Builder {
            private String connectorId; 
            private String createTime; 
            private String name; 
            private String regionId; 
            private String status; 
            private String switchStatus; 
            private UpgradeTime upgradeTime; 

            private Builder() {
            } 

            private Builder(Connector model) {
                this.connectorId = model.connectorId;
                this.createTime = model.createTime;
                this.name = model.name;
                this.regionId = model.regionId;
                this.status = model.status;
                this.switchStatus = model.switchStatus;
                this.upgradeTime = model.upgradeTime;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SwitchStatus.
             */
            public Builder switchStatus(String switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            /**
             * UpgradeTime.
             */
            public Builder upgradeTime(UpgradeTime upgradeTime) {
                this.upgradeTime = upgradeTime;
                return this;
            }

            public Connector build() {
                return new Connector(this);
            } 

        } 

    }
}
