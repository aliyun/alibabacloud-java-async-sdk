// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ExecuteLogQueryRequest} extends {@link RequestModel}
 *
 * <p>ExecuteLogQueryRequest</p>
 */
public class ExecuteLogQueryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendContentPacked")
    private String extendContentPacked;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCondition")
    private String logCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogProjectName")
    private String logProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogQuery")
    private String logQuery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogRegionId")
    private String logRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogUserId")
    private Long logUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
    private String normalizationSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ExecuteLogQueryRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.extendContentPacked = builder.extendContentPacked;
        this.lang = builder.lang;
        this.logCondition = builder.logCondition;
        this.logProjectName = builder.logProjectName;
        this.logQuery = builder.logQuery;
        this.logRegionId = builder.logRegionId;
        this.logStoreName = builder.logStoreName;
        this.logUserId = builder.logUserId;
        this.normalizationSchemaId = builder.normalizationSchemaId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteLogQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return extendContentPacked
     */
    public String getExtendContentPacked() {
        return this.extendContentPacked;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logCondition
     */
    public String getLogCondition() {
        return this.logCondition;
    }

    /**
     * @return logProjectName
     */
    public String getLogProjectName() {
        return this.logProjectName;
    }

    /**
     * @return logQuery
     */
    public String getLogQuery() {
        return this.logQuery;
    }

    /**
     * @return logRegionId
     */
    public String getLogRegionId() {
        return this.logRegionId;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return logUserId
     */
    public Long getLogUserId() {
        return this.logUserId;
    }

    /**
     * @return normalizationSchemaId
     */
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ExecuteLogQueryRequest, Builder> {
        private String endTime; 
        private String extendContentPacked; 
        private String lang; 
        private String logCondition; 
        private String logProjectName; 
        private String logQuery; 
        private String logRegionId; 
        private String logStoreName; 
        private Long logUserId; 
        private String normalizationSchemaId; 
        private String regionId; 
        private Long roleFor; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteLogQueryRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.extendContentPacked = request.extendContentPacked;
            this.lang = request.lang;
            this.logCondition = request.logCondition;
            this.logProjectName = request.logProjectName;
            this.logQuery = request.logQuery;
            this.logRegionId = request.logRegionId;
            this.logStoreName = request.logStoreName;
            this.logUserId = request.logUserId;
            this.normalizationSchemaId = request.normalizationSchemaId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time. The value is a UNIX timestamp in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to pack non-standard fields into the extended field extend_content. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder extendContentPacked(String extendContentPacked) {
            this.putBodyParameter("ExtendContentPacked", extendContentPacked);
            this.extendContentPacked = extendContentPacked;
            return this;
        }

        /**
         * <p>The language of the response messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English. This parameter is required. If not specified, the service returns a 400 error. Explicitly set this parameter to zh or en.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The log query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;alert_level\&quot;:[\&quot;5\&quot;,\&quot;4\&quot;,\&quot;3\&quot;,\&quot;2\&quot;,\&quot;1\&quot;]}</p>
         */
        public Builder logCondition(String logCondition) {
            this.putBodyParameter("LogCondition", logCondition);
            this.logCondition = logCondition;
            return this;
        }

        /**
         * <p>The name of the Simple Log Service project. This parameter is required when executing a log query.</p>
         * 
         * <strong>example:</strong>
         * <p>slsaudit-center-173326*******-cn-hangzhou</p>
         */
        public Builder logProjectName(String logProjectName) {
            this.putBodyParameter("LogProjectName", logProjectName);
            this.logProjectName = logProjectName;
            return this;
        }

        /**
         * <p>The Simple Log Service query statement.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder logQuery(String logQuery) {
            this.putBodyParameter("LogQuery", logQuery);
            this.logQuery = logQuery;
            return this;
        }

        /**
         * <p>The ID of the log storage region. This parameter is required when executing a log query.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder logRegionId(String logRegionId) {
            this.putBodyParameter("LogRegionId", logRegionId);
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * <p>The name of the Simple Log Service project. This parameter is required when executing a log query.</p>
         * 
         * <strong>example:</strong>
         * <p>huawei-cn-cfw</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.putBodyParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>The user ID for data access.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder logUserId(Long logUserId) {
            this.putBodyParameter("LogUserId", logUserId);
            this.logUserId = logUserId;
            return this;
        }

        /**
         * <p>The NormalizationSchemaId to specify if packing is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>WAF_ALERT_ACTIVITY</p>
         */
        public Builder normalizationSchemaId(String normalizationSchemaId) {
            this.putBodyParameter("NormalizationSchemaId", normalizationSchemaId);
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }

        /**
         * <p>The region where the data management center of the threat analysis feature is located. Select the management center region based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: Assets are located outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID of the member account that the administrator switches to.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The start time. The value is a UNIX timestamp in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ExecuteLogQueryRequest build() {
            return new ExecuteLogQueryRequest(this);
        } 

    } 

}
