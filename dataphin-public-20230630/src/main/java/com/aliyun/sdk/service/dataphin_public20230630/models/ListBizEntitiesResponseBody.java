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
 * {@link ListBizEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBizEntitiesResponseBody</p>
 */
public class ListBizEntitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListBizEntitiesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBizEntitiesResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListBizEntitiesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The paginated result.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBizEntitiesResponseBody build() {
            return new ListBizEntitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBizEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBizEntitiesResponseBody</p>
     */
    public static class BizEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BelongToBizEntityIdList")
        private java.util.List<Long> belongToBizEntityIdList;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("ChildBizEntityIdList")
        private java.util.List<Long> childBizEntityIdList;

        @com.aliyun.core.annotation.NameInMap("DataDomainId")
        private Long dataDomainId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HasChildBizEntity")
        private Boolean hasChildBizEntity;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LastModifierName")
        private String lastModifierName;

        @com.aliyun.core.annotation.NameInMap("LevelSubBizObject")
        private Boolean levelSubBizObject;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OnlineStatus")
        private String onlineStatus;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("RefBizEntityIdList")
        private java.util.List<Long> refBizEntityIdList;

        @com.aliyun.core.annotation.NameInMap("RefTableCount")
        private Integer refTableCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("SuffixBizEntityIdList")
        private java.util.List<Long> suffixBizEntityIdList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BizEntityList(Builder builder) {
            this.belongToBizEntityIdList = builder.belongToBizEntityIdList;
            this.bizUnitId = builder.bizUnitId;
            this.childBizEntityIdList = builder.childBizEntityIdList;
            this.dataDomainId = builder.dataDomainId;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hasChildBizEntity = builder.hasChildBizEntity;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.lastModifierName = builder.lastModifierName;
            this.levelSubBizObject = builder.levelSubBizObject;
            this.name = builder.name;
            this.onlineStatus = builder.onlineStatus;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
            this.refBizEntityIdList = builder.refBizEntityIdList;
            this.refTableCount = builder.refTableCount;
            this.status = builder.status;
            this.subType = builder.subType;
            this.suffixBizEntityIdList = builder.suffixBizEntityIdList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizEntityList create() {
            return builder().build();
        }

        /**
         * @return belongToBizEntityIdList
         */
        public java.util.List<Long> getBelongToBizEntityIdList() {
            return this.belongToBizEntityIdList;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return childBizEntityIdList
         */
        public java.util.List<Long> getChildBizEntityIdList() {
            return this.childBizEntityIdList;
        }

        /**
         * @return dataDomainId
         */
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hasChildBizEntity
         */
        public Boolean getHasChildBizEntity() {
            return this.hasChildBizEntity;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastModifier
         */
        public String getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return lastModifierName
         */
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        /**
         * @return levelSubBizObject
         */
        public Boolean getLevelSubBizObject() {
            return this.levelSubBizObject;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onlineStatus
         */
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return refBizEntityIdList
         */
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        /**
         * @return refTableCount
         */
        public Integer getRefTableCount() {
            return this.refTableCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return suffixBizEntityIdList
         */
        public java.util.List<Long> getSuffixBizEntityIdList() {
            return this.suffixBizEntityIdList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Long> belongToBizEntityIdList; 
            private Long bizUnitId; 
            private java.util.List<Long> childBizEntityIdList; 
            private Long dataDomainId; 
            private String description; 
            private String displayName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean hasChildBizEntity; 
            private Long id; 
            private String lastModifier; 
            private String lastModifierName; 
            private Boolean levelSubBizObject; 
            private String name; 
            private String onlineStatus; 
            private String ownerName; 
            private String ownerUserId; 
            private java.util.List<Long> refBizEntityIdList; 
            private Integer refTableCount; 
            private String status; 
            private String subType; 
            private java.util.List<Long> suffixBizEntityIdList; 
            private String type; 

            private Builder() {
            } 

            private Builder(BizEntityList model) {
                this.belongToBizEntityIdList = model.belongToBizEntityIdList;
                this.bizUnitId = model.bizUnitId;
                this.childBizEntityIdList = model.childBizEntityIdList;
                this.dataDomainId = model.dataDomainId;
                this.description = model.description;
                this.displayName = model.displayName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hasChildBizEntity = model.hasChildBizEntity;
                this.id = model.id;
                this.lastModifier = model.lastModifier;
                this.lastModifierName = model.lastModifierName;
                this.levelSubBizObject = model.levelSubBizObject;
                this.name = model.name;
                this.onlineStatus = model.onlineStatus;
                this.ownerName = model.ownerName;
                this.ownerUserId = model.ownerUserId;
                this.refBizEntityIdList = model.refBizEntityIdList;
                this.refTableCount = model.refTableCount;
                this.status = model.status;
                this.subType = model.subType;
                this.suffixBizEntityIdList = model.suffixBizEntityIdList;
                this.type = model.type;
            } 

            /**
             * <p>The list of parent business process IDs. This parameter is valid only when the entity type is business process.</p>
             */
            public Builder belongToBizEntityIdList(java.util.List<Long> belongToBizEntityIdList) {
                this.belongToBizEntityIdList = belongToBizEntityIdList;
                return this;
            }

            /**
             * <p>The ID of the business unit to which the business process belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>6798087749072704</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>The list of child business object IDs. This parameter is valid only when the entity type is business object.</p>
             */
            public Builder childBizEntityIdList(java.util.List<Long> childBizEntityIdList) {
                this.childBizEntityIdList = childBizEntityIdList;
                return this;
            }

            /**
             * <p>The ID of the data domain to which the business process belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>20101011</p>
             */
            public Builder dataDomainId(Long dataDomainId) {
                this.dataDomainId = dataDomainId;
                return this;
            }

            /**
             * <p>The description of the business entity.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the business entity.</p>
             * 
             * <strong>example:</strong>
             * <p>业务活动测试</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The time when the business entity was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 10:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the business entity was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 10:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the entity is a child business object.</p>
             */
            public Builder hasChildBizEntity(Boolean hasChildBizEntity) {
                this.hasChildBizEntity = hasChildBizEntity;
                return this;
            }

            /**
             * <p>The ID of the business entity.</p>
             * 
             * <strong>example:</strong>
             * <p>12121111</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the user who last modified the business entity.</p>
             * 
             * <strong>example:</strong>
             * <p>30010010</p>
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * <p>The name of the user who last modified the business entity.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
                return this;
            }

            /**
             * <p>Indicates whether the entity is a sublevel of a hierarchy dimension.</p>
             */
            public Builder levelSubBizObject(Boolean levelSubBizObject) {
                this.levelSubBizObject = levelSubBizObject;
                return this;
            }

            /**
             * <p>The name of the business entity.</p>
             * 
             * <strong>example:</strong>
             * <p>create_process_code_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The online status of the business entity. Valid values: </p>
             * <ul>
             * <li>SUBMITTED: not online.</li>
             * <li>APPROVING: pending approval.</li>
             * <li>PUBLISHED: online.</li>
             * <li>REJECT: failed to go online.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUBMITTED</p>
             */
            public Builder onlineStatus(String onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * <p>The ID of the business entity owner.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The ID of the business entity owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30010010</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The list of associated central business entity IDs.</p>
             */
            public Builder refBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
                this.refBizEntityIdList = refBizEntityIdList;
                return this;
            }

            /**
             * <p>The number of associated logical tables.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder refTableCount(Integer refTableCount) {
                this.refTableCount = refTableCount;
                return this;
            }

            /**
             * <p>The status of the business entity. Valid values:</p>
             * <ul>
             * <li>DRAFT: draft or not online.</li>
             * <li>SUBMITTING: being submitted.</li>
             * <li>SUBMITTED: submitted.</li>
             * <li>DEVELOPING: under development.</li>
             * <li>PUBLISHING: being published.</li>
             * <li>PUBLISHED: published.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUBMITTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subtype of the business entity.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The list of subsequent business process IDs. This parameter is valid only when the entity type is business process.</p>
             */
            public Builder suffixBizEntityIdList(java.util.List<Long> suffixBizEntityIdList) {
                this.suffixBizEntityIdList = suffixBizEntityIdList;
                return this;
            }

            /**
             * <p>The type of the business entity. Valid values:</p>
             * <ul>
             * <li>BIZ_OBJECT: business object.</li>
             * <li>BIZ_PROCESS: business process.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BIZ_OBJECT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BizEntityList build() {
                return new BizEntityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBizEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBizEntitiesResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizEntityList")
        private java.util.List<BizEntityList> bizEntityList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.bizEntityList = builder.bizEntityList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return bizEntityList
         */
        public java.util.List<BizEntityList> getBizEntityList() {
            return this.bizEntityList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<BizEntityList> bizEntityList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.bizEntityList = model.bizEntityList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of business entities.</p>
             */
            public Builder bizEntityList(java.util.List<BizEntityList> bizEntityList) {
                this.bizEntityList = bizEntityList;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
