// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link PunishResourceSearchResponseBody} extends {@link TeaModel}
 *
 * <p>PunishResourceSearchResponseBody</p>
 */
public class PunishResourceSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("ViewCount")
    private Integer viewCount;

    private PunishResourceSearchResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataList = builder.dataList;
        this.message = builder.message;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.viewCount = builder.viewCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PunishResourceSearchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return viewCount
     */
    public Integer getViewCount() {
        return this.viewCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<DataList> dataList; 
        private String message; 
        private String success; 
        private Integer totalCount; 
        private Integer viewCount; 

        private Builder() {
        } 

        private Builder(PunishResourceSearchResponseBody model) {
            this.code = model.code;
            this.dataList = model.dataList;
            this.message = model.message;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.viewCount = model.viewCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * ViewCount.
         */
        public Builder viewCount(Integer viewCount) {
            this.viewCount = viewCount;
            return this;
        }

        public PunishResourceSearchResponseBody build() {
            return new PunishResourceSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PunishResourceSearchResponseBody} extends {@link TeaModel}
     *
     * <p>PunishResourceSearchResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionCode")
        private String actionCode;

        @com.aliyun.core.annotation.NameInMap("BussinessCode")
        private String bussinessCode;

        @com.aliyun.core.annotation.NameInMap("Class")
        private String _class;

        @com.aliyun.core.annotation.NameInMap("Coordinate")
        private String coordinate;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private String extras;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("ObjectValue")
        private String objectValue;

        @com.aliyun.core.annotation.NameInMap("PunishFrom")
        private String punishFrom;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private Long requestId;

        @com.aliyun.core.annotation.NameInMap("SourceCode")
        private String sourceCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private DataList(Builder builder) {
            this.actionCode = builder.actionCode;
            this.bussinessCode = builder.bussinessCode;
            this._class = builder._class;
            this.coordinate = builder.coordinate;
            this.creator = builder.creator;
            this.deleted = builder.deleted;
            this.domain = builder.domain;
            this.extras = builder.extras;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.modifier = builder.modifier;
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
            this.objectValue = builder.objectValue;
            this.punishFrom = builder.punishFrom;
            this.reason = builder.reason;
            this.requestId = builder.requestId;
            this.sourceCode = builder.sourceCode;
            this.status = builder.status;
            this.url = builder.url;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return actionCode
         */
        public String getActionCode() {
            return this.actionCode;
        }

        /**
         * @return bussinessCode
         */
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return coordinate
         */
        public String getCoordinate() {
            return this.coordinate;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return extras
         */
        public String getExtras() {
            return this.extras;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return objectValue
         */
        public String getObjectValue() {
            return this.objectValue;
        }

        /**
         * @return punishFrom
         */
        public String getPunishFrom() {
            return this.punishFrom;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return requestId
         */
        public Long getRequestId() {
            return this.requestId;
        }

        /**
         * @return sourceCode
         */
        public String getSourceCode() {
            return this.sourceCode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String actionCode; 
            private String bussinessCode; 
            private String _class; 
            private String coordinate; 
            private String creator; 
            private Boolean deleted; 
            private String domain; 
            private String extras; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private String instanceId; 
            private String ip; 
            private String modifier; 
            private String objectId; 
            private String objectType; 
            private String objectValue; 
            private String punishFrom; 
            private String reason; 
            private Long requestId; 
            private String sourceCode; 
            private String status; 
            private String url; 
            private String userId; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.actionCode = model.actionCode;
                this.bussinessCode = model.bussinessCode;
                this._class = model._class;
                this.coordinate = model.coordinate;
                this.creator = model.creator;
                this.deleted = model.deleted;
                this.domain = model.domain;
                this.extras = model.extras;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.ip = model.ip;
                this.modifier = model.modifier;
                this.objectId = model.objectId;
                this.objectType = model.objectType;
                this.objectValue = model.objectValue;
                this.punishFrom = model.punishFrom;
                this.reason = model.reason;
                this.requestId = model.requestId;
                this.sourceCode = model.sourceCode;
                this.status = model.status;
                this.url = model.url;
                this.userId = model.userId;
            } 

            /**
             * ActionCode.
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * BussinessCode.
             */
            public Builder bussinessCode(String bussinessCode) {
                this.bussinessCode = bussinessCode;
                return this;
            }

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * Coordinate.
             */
            public Builder coordinate(String coordinate) {
                this.coordinate = coordinate;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Extras.
             */
            public Builder extras(String extras) {
                this.extras = extras;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ObjectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * ObjectValue.
             */
            public Builder objectValue(String objectValue) {
                this.objectValue = objectValue;
                return this;
            }

            /**
             * PunishFrom.
             */
            public Builder punishFrom(String punishFrom) {
                this.punishFrom = punishFrom;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(Long requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * SourceCode.
             */
            public Builder sourceCode(String sourceCode) {
                this.sourceCode = sourceCode;
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
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
