// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetTlogCollectListRequest} extends {@link RequestModel}
 *
 * <p>GetTlogCollectListRequest</p>
 */
public class GetTlogCollectListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Author")
    private String author;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginDate")
    private Long beginDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateBeginDate")
    private Long createBeginDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateEndDate")
    private Long createEndDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Os")
    @com.aliyun.core.annotation.Validation(required = true)
    private String os;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsVersion")
    private String osVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PositiveComment")
    private String positiveComment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateBeginDate")
    private Long updateBeginDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateEndDate")
    private Long updateEndDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserNick")
    private String userNick;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Utdid")
    private String utdid;

    private GetTlogCollectListRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.appVersion = builder.appVersion;
        this.author = builder.author;
        this.beginDate = builder.beginDate;
        this.city = builder.city;
        this.createBeginDate = builder.createBeginDate;
        this.createEndDate = builder.createEndDate;
        this.deviceId = builder.deviceId;
        this.endDate = builder.endDate;
        this.keyword = builder.keyword;
        this.model = builder.model;
        this.os = builder.os;
        this.osVersion = builder.osVersion;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.positiveComment = builder.positiveComment;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
        this.updateBeginDate = builder.updateBeginDate;
        this.updateEndDate = builder.updateEndDate;
        this.userNick = builder.userNick;
        this.utdid = builder.utdid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTlogCollectListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * @return beginDate
     */
    public Long getBeginDate() {
        return this.beginDate;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return createBeginDate
     */
    public Long getCreateBeginDate() {
        return this.createBeginDate;
    }

    /**
     * @return createEndDate
     */
    public Long getCreateEndDate() {
        return this.createEndDate;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return osVersion
     */
    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return positiveComment
     */
    public String getPositiveComment() {
        return this.positiveComment;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateBeginDate
     */
    public Long getUpdateBeginDate() {
        return this.updateBeginDate;
    }

    /**
     * @return updateEndDate
     */
    public Long getUpdateEndDate() {
        return this.updateEndDate;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    /**
     * @return utdid
     */
    public String getUtdid() {
        return this.utdid;
    }

    public static final class Builder extends Request.Builder<GetTlogCollectListRequest, Builder> {
        private Long appKey; 
        private String appVersion; 
        private String author; 
        private Long beginDate; 
        private String city; 
        private Long createBeginDate; 
        private Long createEndDate; 
        private String deviceId; 
        private Long endDate; 
        private String keyword; 
        private String model; 
        private String os; 
        private String osVersion; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String positiveComment; 
        private String sourceType; 
        private String status; 
        private Long updateBeginDate; 
        private Long updateEndDate; 
        private String userNick; 
        private String utdid; 

        private Builder() {
            super();
        } 

        private Builder(GetTlogCollectListRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.appVersion = request.appVersion;
            this.author = request.author;
            this.beginDate = request.beginDate;
            this.city = request.city;
            this.createBeginDate = request.createBeginDate;
            this.createEndDate = request.createEndDate;
            this.deviceId = request.deviceId;
            this.endDate = request.endDate;
            this.keyword = request.keyword;
            this.model = request.model;
            this.os = request.os;
            this.osVersion = request.osVersion;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.positiveComment = request.positiveComment;
            this.sourceType = request.sourceType;
            this.status = request.status;
            this.updateBeginDate = request.updateBeginDate;
            this.updateEndDate = request.updateEndDate;
            this.userNick = request.userNick;
            this.utdid = request.utdid;
        } 

        /**
         * <p>appKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24780725</p>
         */
        public Builder appKey(Long appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * Author.
         */
        public Builder author(String author) {
            this.putBodyParameter("Author", author);
            this.author = author;
            return this;
        }

        /**
         * BeginDate.
         */
        public Builder beginDate(Long beginDate) {
            this.putBodyParameter("BeginDate", beginDate);
            this.beginDate = beginDate;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.putBodyParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * CreateBeginDate.
         */
        public Builder createBeginDate(Long createBeginDate) {
            this.putBodyParameter("CreateBeginDate", createBeginDate);
            this.createBeginDate = createBeginDate;
            return this;
        }

        /**
         * CreateEndDate.
         */
        public Builder createEndDate(Long createEndDate) {
            this.putBodyParameter("CreateEndDate", createEndDate);
            this.createEndDate = createEndDate;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        public Builder os(String os) {
            this.putBodyParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * OsVersion.
         */
        public Builder osVersion(String osVersion) {
            this.putBodyParameter("OsVersion", osVersion);
            this.osVersion = osVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PositiveComment.
         */
        public Builder positiveComment(String positiveComment) {
            this.putBodyParameter("PositiveComment", positiveComment);
            this.positiveComment = positiveComment;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UpdateBeginDate.
         */
        public Builder updateBeginDate(Long updateBeginDate) {
            this.putBodyParameter("UpdateBeginDate", updateBeginDate);
            this.updateBeginDate = updateBeginDate;
            return this;
        }

        /**
         * UpdateEndDate.
         */
        public Builder updateEndDate(Long updateEndDate) {
            this.putBodyParameter("UpdateEndDate", updateEndDate);
            this.updateEndDate = updateEndDate;
            return this;
        }

        /**
         * UserNick.
         */
        public Builder userNick(String userNick) {
            this.putBodyParameter("UserNick", userNick);
            this.userNick = userNick;
            return this;
        }

        /**
         * Utdid.
         */
        public Builder utdid(String utdid) {
            this.putBodyParameter("Utdid", utdid);
            this.utdid = utdid;
            return this;
        }

        @Override
        public GetTlogCollectListRequest build() {
            return new GetTlogCollectListRequest(this);
        } 

    } 

}
