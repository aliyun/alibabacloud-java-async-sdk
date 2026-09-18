// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link SaveSkillAuditRecordRequest} extends {@link RequestModel}
 *
 * <p>SaveSkillAuditRecordRequest</p>
 */
public class SaveSkillAuditRecordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("batchId")
    private String batchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cid")
    private String cid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dryRunStatus")
    private String dryRunStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recordType")
    private String recordType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptTransformResult")
    private String scriptTransformResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptTransformStatus")
    private String scriptTransformStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceDialect")
    private String sourceDialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceSqlScript")
    private String sourceSqlScript;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetDialect")
    private String targetDialect;

    private SaveSkillAuditRecordRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.cid = builder.cid;
        this.dryRunStatus = builder.dryRunStatus;
        this.extInfo = builder.extInfo;
        this.recordType = builder.recordType;
        this.scriptTransformResult = builder.scriptTransformResult;
        this.scriptTransformStatus = builder.scriptTransformStatus;
        this.sourceDialect = builder.sourceDialect;
        this.sourceSqlScript = builder.sourceSqlScript;
        this.targetDialect = builder.targetDialect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSkillAuditRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return cid
     */
    public String getCid() {
        return this.cid;
    }

    /**
     * @return dryRunStatus
     */
    public String getDryRunStatus() {
        return this.dryRunStatus;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    /**
     * @return scriptTransformResult
     */
    public String getScriptTransformResult() {
        return this.scriptTransformResult;
    }

    /**
     * @return scriptTransformStatus
     */
    public String getScriptTransformStatus() {
        return this.scriptTransformStatus;
    }

    /**
     * @return sourceDialect
     */
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    /**
     * @return sourceSqlScript
     */
    public String getSourceSqlScript() {
        return this.sourceSqlScript;
    }

    /**
     * @return targetDialect
     */
    public String getTargetDialect() {
        return this.targetDialect;
    }

    public static final class Builder extends Request.Builder<SaveSkillAuditRecordRequest, Builder> {
        private String batchId; 
        private String cid; 
        private String dryRunStatus; 
        private String extInfo; 
        private String recordType; 
        private String scriptTransformResult; 
        private String scriptTransformStatus; 
        private String sourceDialect; 
        private String sourceSqlScript; 
        private String targetDialect; 

        private Builder() {
            super();
        } 

        private Builder(SaveSkillAuditRecordRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.cid = request.cid;
            this.dryRunStatus = request.dryRunStatus;
            this.extInfo = request.extInfo;
            this.recordType = request.recordType;
            this.scriptTransformResult = request.scriptTransformResult;
            this.scriptTransformStatus = request.scriptTransformStatus;
            this.sourceDialect = request.sourceDialect;
            this.sourceSqlScript = request.sourceSqlScript;
            this.targetDialect = request.targetDialect;
        } 

        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        public Builder batchId(String batchId) {
            this.putBodyParameter("batchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12313</p>
         */
        public Builder cid(String cid) {
            this.putBodyParameter("cid", cid);
            this.cid = cid;
            return this;
        }

        /**
         * <p>The dry run status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder dryRunStatus(String dryRunStatus) {
            this.putBodyParameter("dryRunStatus", dryRunStatus);
            this.dryRunStatus = dryRunStatus;
            return this;
        }

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("extInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * <p>The record type.</p>
         * 
         * <strong>example:</strong>
         * <p>logCorrelation</p>
         */
        public Builder recordType(String recordType) {
            this.putBodyParameter("recordType", recordType);
            this.recordType = recordType;
            return this;
        }

        /**
         * <p>The conversion result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder scriptTransformResult(String scriptTransformResult) {
            this.putBodyParameter("scriptTransformResult", scriptTransformResult);
            this.scriptTransformResult = scriptTransformResult;
            return this;
        }

        /**
         * <p>The conversion status.</p>
         * 
         * <strong>example:</strong>
         * <p>end</p>
         */
        public Builder scriptTransformStatus(String scriptTransformStatus) {
            this.putBodyParameter("scriptTransformStatus", scriptTransformStatus);
            this.scriptTransformStatus = scriptTransformStatus;
            return this;
        }

        /**
         * <p>The source dialect.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder sourceDialect(String sourceDialect) {
            this.putBodyParameter("sourceDialect", sourceDialect);
            this.sourceDialect = sourceDialect;
            return this;
        }

        /**
         * <p>The source dialect content.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM t;</p>
         */
        public Builder sourceSqlScript(String sourceSqlScript) {
            this.putBodyParameter("sourceSqlScript", sourceSqlScript);
            this.sourceSqlScript = sourceSqlScript;
            return this;
        }

        /**
         * <p>The target dialect.</p>
         * 
         * <strong>example:</strong>
         * <p>bigquery</p>
         */
        public Builder targetDialect(String targetDialect) {
            this.putBodyParameter("targetDialect", targetDialect);
            this.targetDialect = targetDialect;
            return this;
        }

        @Override
        public SaveSkillAuditRecordRequest build() {
            return new SaveSkillAuditRecordRequest(this);
        } 

    } 

}
