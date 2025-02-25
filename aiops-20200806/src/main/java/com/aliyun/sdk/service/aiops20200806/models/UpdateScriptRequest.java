// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateScriptRequest} extends {@link RequestModel}
 *
 * <p>UpdateScriptRequest</p>
 */
public class UpdateScriptRequest extends Request {
    @Query
    @NameInMap("HandleSuggestDesc")
    private String handleSuggestDesc;

    @Query
    @NameInMap("Id")
    private Integer id;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("RootCauseDesc")
    private String rootCauseDesc;

    @Query
    @NameInMap("RootCausesLog")
    private String rootCausesLog;

    @Query
    @NameInMap("SceneId")
    private String sceneId;

    @Query
    @NameInMap("Script")
    private String script;

    @Query
    @NameInMap("ScriptLanguage")
    private String scriptLanguage;

    @Query
    @NameInMap("ScriptName")
    private String scriptName;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("Type")
    private Integer type;

    private UpdateScriptRequest(Builder builder) {
        super(builder);
        this.handleSuggestDesc = builder.handleSuggestDesc;
        this.id = builder.id;
        this.metricName = builder.metricName;
        this.operaUid = builder.operaUid;
        this.productCode = builder.productCode;
        this.rootCauseDesc = builder.rootCauseDesc;
        this.rootCausesLog = builder.rootCausesLog;
        this.sceneId = builder.sceneId;
        this.script = builder.script;
        this.scriptLanguage = builder.scriptLanguage;
        this.scriptName = builder.scriptName;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return handleSuggestDesc
     */
    public String getHandleSuggestDesc() {
        return this.handleSuggestDesc;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return rootCauseDesc
     */
    public String getRootCauseDesc() {
        return this.rootCauseDesc;
    }

    /**
     * @return rootCausesLog
     */
    public String getRootCausesLog() {
        return this.rootCausesLog;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return scriptLanguage
     */
    public String getScriptLanguage() {
        return this.scriptLanguage;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateScriptRequest, Builder> {
        private String handleSuggestDesc; 
        private Integer id; 
        private String metricName; 
        private String operaUid; 
        private String productCode; 
        private String rootCauseDesc; 
        private String rootCausesLog; 
        private String sceneId; 
        private String script; 
        private String scriptLanguage; 
        private String scriptName; 
        private Integer status; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScriptRequest request) {
            super(request);
            this.handleSuggestDesc = request.handleSuggestDesc;
            this.id = request.id;
            this.metricName = request.metricName;
            this.operaUid = request.operaUid;
            this.productCode = request.productCode;
            this.rootCauseDesc = request.rootCauseDesc;
            this.rootCausesLog = request.rootCausesLog;
            this.sceneId = request.sceneId;
            this.script = request.script;
            this.scriptLanguage = request.scriptLanguage;
            this.scriptName = request.scriptName;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * HandleSuggestDesc.
         */
        public Builder handleSuggestDesc(String handleSuggestDesc) {
            this.putQueryParameter("HandleSuggestDesc", handleSuggestDesc);
            this.handleSuggestDesc = handleSuggestDesc;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * RootCauseDesc.
         */
        public Builder rootCauseDesc(String rootCauseDesc) {
            this.putQueryParameter("RootCauseDesc", rootCauseDesc);
            this.rootCauseDesc = rootCauseDesc;
            return this;
        }

        /**
         * RootCausesLog.
         */
        public Builder rootCausesLog(String rootCausesLog) {
            this.putQueryParameter("RootCausesLog", rootCausesLog);
            this.rootCausesLog = rootCausesLog;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(String script) {
            this.putQueryParameter("Script", script);
            this.script = script;
            return this;
        }

        /**
         * ScriptLanguage.
         */
        public Builder scriptLanguage(String scriptLanguage) {
            this.putQueryParameter("ScriptLanguage", scriptLanguage);
            this.scriptLanguage = scriptLanguage;
            return this;
        }

        /**
         * ScriptName.
         */
        public Builder scriptName(String scriptName) {
            this.putQueryParameter("ScriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateScriptRequest build() {
            return new UpdateScriptRequest(this);
        } 

    } 

}
