// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link BindVariableRequest} extends {@link RequestModel}
 *
 * <p>BindVariableRequest</p>
 */
public class BindVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiRegionId")
    private String apiRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiType")
    private String apiType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("defineId")
    private String defineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("defineIds")
    private String defineIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("exceptionValue")
    private String exceptionValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("outputField")
    private String outputField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("outputType")
    private String outputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("paramsList")
    private String paramsList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private BindVariableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.apiRegionId = builder.apiRegionId;
        this.apiType = builder.apiType;
        this.createType = builder.createType;
        this.defineId = builder.defineId;
        this.defineIds = builder.defineIds;
        this.description = builder.description;
        this.eventCode = builder.eventCode;
        this.exceptionValue = builder.exceptionValue;
        this.id = builder.id;
        this.outputField = builder.outputField;
        this.outputType = builder.outputType;
        this.params = builder.params;
        this.paramsList = builder.paramsList;
        this.regId = builder.regId;
        this.sourceType = builder.sourceType;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindVariableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return apiRegionId
     */
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return defineId
     */
    public String getDefineId() {
        return this.defineId;
    }

    /**
     * @return defineIds
     */
    public String getDefineIds() {
        return this.defineIds;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return exceptionValue
     */
    public String getExceptionValue() {
        return this.exceptionValue;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return outputField
     */
    public String getOutputField() {
        return this.outputField;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return paramsList
     */
    public String getParamsList() {
        return this.paramsList;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<BindVariableRequest, Builder> {
        private String lang; 
        private String apiRegionId; 
        private String apiType; 
        private String createType; 
        private String defineId; 
        private String defineIds; 
        private String description; 
        private String eventCode; 
        private String exceptionValue; 
        private Long id; 
        private String outputField; 
        private String outputType; 
        private String params; 
        private String paramsList; 
        private String regId; 
        private String sourceType; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(BindVariableRequest request) {
            super(request);
            this.lang = request.lang;
            this.apiRegionId = request.apiRegionId;
            this.apiType = request.apiType;
            this.createType = request.createType;
            this.defineId = request.defineId;
            this.defineIds = request.defineIds;
            this.description = request.description;
            this.eventCode = request.eventCode;
            this.exceptionValue = request.exceptionValue;
            this.id = request.id;
            this.outputField = request.outputField;
            this.outputType = request.outputType;
            this.params = request.params;
            this.paramsList = request.paramsList;
            this.regId = request.regId;
            this.sourceType = request.sourceType;
            this.title = request.title;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>API region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder apiRegionId(String apiRegionId) {
            this.putQueryParameter("apiRegionId", apiRegionId);
            this.apiRegionId = apiRegionId;
            return this;
        }

        /**
         * <p>API type</p>
         * 
         * <strong>example:</strong>
         * <p>SELF</p>
         */
        public Builder apiType(String apiType) {
            this.putQueryParameter("apiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * <p>Creation type</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * <p>Associated variable definition primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>2438</p>
         */
        public Builder defineId(String defineId) {
            this.putQueryParameter("defineId", defineId);
            this.defineId = defineId;
            return this;
        }

        /**
         * <p>Variable definition IDs, can be multiple. If binding multiple IDs, separate them with commas</p>
         * 
         * <strong>example:</strong>
         * <p>1546, 1547</p>
         */
        public Builder defineIds(String defineIds) {
            this.putQueryParameter("defineIds", defineIds);
            this.defineIds = defineIds;
            return this;
        }

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Event code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>de_agbzfi5134</p>
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * <p>Exception value</p>
         * 
         * <strong>example:</strong>
         * <p>SYS_ERROR</p>
         */
        public Builder exceptionValue(String exceptionValue) {
            this.putQueryParameter("exceptionValue", exceptionValue);
            this.exceptionValue = exceptionValue;
            return this;
        }

        /**
         * <p>Variable primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>106875</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Output field path</p>
         * 
         * <strong>example:</strong>
         * <p>BOOLEAN</p>
         */
        public Builder outputField(String outputField) {
            this.putQueryParameter("outputField", outputField);
            this.outputField = outputField;
            return this;
        }

        /**
         * <p>Output type</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("outputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * <p>Binding input parameter information</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;accountId&quot;:&quot;accountId&quot;,&quot;mobile&quot;:&quot;&quot;}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>Event parameter mapping 2.0, either params or paramsList must not be empty. List, JSON structure</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;eventFieldName&quot;:&quot;accountId&quot;,&quot;required&quot;:false}]</p>
         */
        public Builder paramsList(String paramsList) {
            this.putQueryParameter("paramsList", paramsList);
            this.paramsList = paramsList;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Variable source</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>Title</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>变量title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public BindVariableRequest build() {
            return new BindVariableRequest(this);
        } 

    } 

}
