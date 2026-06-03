// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link GetSessionListRequest} extends {@link RequestModel}
 *
 * <p>GetSessionListRequest</p>
 */
public class GetSessionListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionList")
    private java.util.List<String> actionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIpList")
    private java.util.List<String> clientIpList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientProgramList")
    private java.util.List<String> clientProgramList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbHostList")
    private java.util.List<String> dbHostList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    private Integer dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbUserList")
    private java.util.List<String> dbUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private GetSessionListRequest(Builder builder) {
        super(builder);
        this.actionList = builder.actionList;
        this.beginDate = builder.beginDate;
        this.clientIpList = builder.clientIpList;
        this.clientProgramList = builder.clientProgramList;
        this.dbHostList = builder.dbHostList;
        this.dbId = builder.dbId;
        this.dbUserList = builder.dbUserList;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSessionListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionList
     */
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    /**
     * @return beginDate
     */
    public String getBeginDate() {
        return this.beginDate;
    }

    /**
     * @return clientIpList
     */
    public java.util.List<String> getClientIpList() {
        return this.clientIpList;
    }

    /**
     * @return clientProgramList
     */
    public java.util.List<String> getClientProgramList() {
        return this.clientProgramList;
    }

    /**
     * @return dbHostList
     */
    public java.util.List<String> getDbHostList() {
        return this.dbHostList;
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return dbUserList
     */
    public java.util.List<String> getDbUserList() {
        return this.dbUserList;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<GetSessionListRequest, Builder> {
        private java.util.List<String> actionList; 
        private String beginDate; 
        private java.util.List<String> clientIpList; 
        private java.util.List<String> clientProgramList; 
        private java.util.List<String> dbHostList; 
        private Integer dbId; 
        private java.util.List<String> dbUserList; 
        private String endDate; 
        private String instanceId; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSessionListRequest request) {
            super(request);
            this.actionList = request.actionList;
            this.beginDate = request.beginDate;
            this.clientIpList = request.clientIpList;
            this.clientProgramList = request.clientProgramList;
            this.dbHostList = request.dbHostList;
            this.dbId = request.dbId;
            this.dbUserList = request.dbUserList;
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
        } 

        /**
         * ActionList.
         */
        public Builder actionList(java.util.List<String> actionList) {
            this.putQueryParameter("ActionList", actionList);
            this.actionList = actionList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-06 00:00:00</p>
         */
        public Builder beginDate(String beginDate) {
            this.putQueryParameter("BeginDate", beginDate);
            this.beginDate = beginDate;
            return this;
        }

        /**
         * ClientIpList.
         */
        public Builder clientIpList(java.util.List<String> clientIpList) {
            this.putQueryParameter("ClientIpList", clientIpList);
            this.clientIpList = clientIpList;
            return this;
        }

        /**
         * ClientProgramList.
         */
        public Builder clientProgramList(java.util.List<String> clientProgramList) {
            this.putQueryParameter("ClientProgramList", clientProgramList);
            this.clientProgramList = clientProgramList;
            return this;
        }

        /**
         * DbHostList.
         */
        public Builder dbHostList(java.util.List<String> dbHostList) {
            this.putQueryParameter("DbHostList", dbHostList);
            this.dbHostList = dbHostList;
            return this;
        }

        /**
         * DbId.
         */
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * DbUserList.
         */
        public Builder dbUserList(java.util.List<String> dbUserList) {
            this.putQueryParameter("DbUserList", dbUserList);
            this.dbUserList = dbUserList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-06 23:59:59</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbaudit-cn-78v1gc****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GetSessionListRequest build() {
            return new GetSessionListRequest(this);
        } 

    } 

}
