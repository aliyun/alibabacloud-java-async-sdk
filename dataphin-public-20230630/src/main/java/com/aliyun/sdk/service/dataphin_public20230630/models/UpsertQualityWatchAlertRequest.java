// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpsertQualityWatchAlertRequest} extends {@link RequestModel}
 *
 * <p>UpsertQualityWatchAlertRequest</p>
 */
public class UpsertQualityWatchAlertRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpsertCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpsertCommand upsertCommand;

    private UpsertQualityWatchAlertRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.upsertCommand = builder.upsertCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertQualityWatchAlertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return upsertCommand
     */
    public UpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static final class Builder extends Request.Builder<UpsertQualityWatchAlertRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpsertCommand upsertCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpsertQualityWatchAlertRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.upsertCommand = request.upsertCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder upsertCommand(UpsertCommand upsertCommand) {
            String upsertCommandShrink = shrink(upsertCommand, "UpsertCommand", "json");
            this.putBodyParameter("UpsertCommand", upsertCommandShrink);
            this.upsertCommand = upsertCommand;
            return this;
        }

        @Override
        public UpsertQualityWatchAlertRequest build() {
            return new UpsertQualityWatchAlertRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpsertQualityWatchAlertRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityWatchAlertRequest</p>
     */
    public static class AlertDutyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private AlertDutyList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertDutyList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(AlertDutyList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AlertDutyList build() {
                return new AlertDutyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityWatchAlertRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityWatchAlertRequest</p>
     */
    public static class AlertUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private AlertUserList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertUserList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(AlertUserList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AlertUserList build() {
                return new AlertUserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityWatchAlertRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityWatchAlertRequest</p>
     */
    public static class QualityAlertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertDutyChannelList")
        private java.util.List<String> alertDutyChannelList;

        @com.aliyun.core.annotation.NameInMap("AlertDutyList")
        private java.util.List<AlertDutyList> alertDutyList;

        @com.aliyun.core.annotation.NameInMap("AlertQualityOwnerChannelList")
        private java.util.List<String> alertQualityOwnerChannelList;

        @com.aliyun.core.annotation.NameInMap("AlertUserChannelList")
        private java.util.List<String> alertUserChannelList;

        @com.aliyun.core.annotation.NameInMap("AlertUserList")
        private java.util.List<AlertUserList> alertUserList;

        @com.aliyun.core.annotation.NameInMap("EnableAlertQualityOwner")
        private Boolean enableAlertQualityOwner;

        private QualityAlertInfo(Builder builder) {
            this.alertDutyChannelList = builder.alertDutyChannelList;
            this.alertDutyList = builder.alertDutyList;
            this.alertQualityOwnerChannelList = builder.alertQualityOwnerChannelList;
            this.alertUserChannelList = builder.alertUserChannelList;
            this.alertUserList = builder.alertUserList;
            this.enableAlertQualityOwner = builder.enableAlertQualityOwner;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityAlertInfo create() {
            return builder().build();
        }

        /**
         * @return alertDutyChannelList
         */
        public java.util.List<String> getAlertDutyChannelList() {
            return this.alertDutyChannelList;
        }

        /**
         * @return alertDutyList
         */
        public java.util.List<AlertDutyList> getAlertDutyList() {
            return this.alertDutyList;
        }

        /**
         * @return alertQualityOwnerChannelList
         */
        public java.util.List<String> getAlertQualityOwnerChannelList() {
            return this.alertQualityOwnerChannelList;
        }

        /**
         * @return alertUserChannelList
         */
        public java.util.List<String> getAlertUserChannelList() {
            return this.alertUserChannelList;
        }

        /**
         * @return alertUserList
         */
        public java.util.List<AlertUserList> getAlertUserList() {
            return this.alertUserList;
        }

        /**
         * @return enableAlertQualityOwner
         */
        public Boolean getEnableAlertQualityOwner() {
            return this.enableAlertQualityOwner;
        }

        public static final class Builder {
            private java.util.List<String> alertDutyChannelList; 
            private java.util.List<AlertDutyList> alertDutyList; 
            private java.util.List<String> alertQualityOwnerChannelList; 
            private java.util.List<String> alertUserChannelList; 
            private java.util.List<AlertUserList> alertUserList; 
            private Boolean enableAlertQualityOwner; 

            private Builder() {
            } 

            private Builder(QualityAlertInfo model) {
                this.alertDutyChannelList = model.alertDutyChannelList;
                this.alertDutyList = model.alertDutyList;
                this.alertQualityOwnerChannelList = model.alertQualityOwnerChannelList;
                this.alertUserChannelList = model.alertUserChannelList;
                this.alertUserList = model.alertUserList;
                this.enableAlertQualityOwner = model.enableAlertQualityOwner;
            } 

            /**
             * AlertDutyChannelList.
             */
            public Builder alertDutyChannelList(java.util.List<String> alertDutyChannelList) {
                this.alertDutyChannelList = alertDutyChannelList;
                return this;
            }

            /**
             * AlertDutyList.
             */
            public Builder alertDutyList(java.util.List<AlertDutyList> alertDutyList) {
                this.alertDutyList = alertDutyList;
                return this;
            }

            /**
             * AlertQualityOwnerChannelList.
             */
            public Builder alertQualityOwnerChannelList(java.util.List<String> alertQualityOwnerChannelList) {
                this.alertQualityOwnerChannelList = alertQualityOwnerChannelList;
                return this;
            }

            /**
             * AlertUserChannelList.
             */
            public Builder alertUserChannelList(java.util.List<String> alertUserChannelList) {
                this.alertUserChannelList = alertUserChannelList;
                return this;
            }

            /**
             * AlertUserList.
             */
            public Builder alertUserList(java.util.List<AlertUserList> alertUserList) {
                this.alertUserList = alertUserList;
                return this;
            }

            /**
             * EnableAlertQualityOwner.
             */
            public Builder enableAlertQualityOwner(Boolean enableAlertQualityOwner) {
                this.enableAlertQualityOwner = enableAlertQualityOwner;
                return this;
            }

            public QualityAlertInfo build() {
                return new QualityAlertInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityWatchAlertRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityWatchAlertRequest</p>
     */
    public static class UpsertCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QualityAlertInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private QualityAlertInfo qualityAlertInfo;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long watchId;

        private UpsertCommand(Builder builder) {
            this.qualityAlertInfo = builder.qualityAlertInfo;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpsertCommand create() {
            return builder().build();
        }

        /**
         * @return qualityAlertInfo
         */
        public QualityAlertInfo getQualityAlertInfo() {
            return this.qualityAlertInfo;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private QualityAlertInfo qualityAlertInfo; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(UpsertCommand model) {
                this.qualityAlertInfo = model.qualityAlertInfo;
                this.watchId = model.watchId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder qualityAlertInfo(QualityAlertInfo qualityAlertInfo) {
                this.qualityAlertInfo = qualityAlertInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public UpsertCommand build() {
                return new UpsertCommand(this);
            } 

        } 

    }
}
