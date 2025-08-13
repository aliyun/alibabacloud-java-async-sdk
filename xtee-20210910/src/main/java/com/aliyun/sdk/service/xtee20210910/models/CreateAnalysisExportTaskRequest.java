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
 * {@link CreateAnalysisExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAnalysisExportTaskRequest</p>
 */
public class CreateAnalysisExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("columns")
    private String columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("conditions")
    private String conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventBeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventBeginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long eventEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fieldName")
    private String fieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateAnalysisExportTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.columns = builder.columns;
        this.conditions = builder.conditions;
        this.eventBeginTime = builder.eventBeginTime;
        this.eventCodes = builder.eventCodes;
        this.eventEndTime = builder.eventEndTime;
        this.fieldName = builder.fieldName;
        this.fieldValue = builder.fieldValue;
        this.fileFormat = builder.fileFormat;
        this.regId = builder.regId;
        this.scope = builder.scope;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnalysisExportTaskRequest create() {
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
     * @return columns
     */
    public String getColumns() {
        return this.columns;
    }

    /**
     * @return conditions
     */
    public String getConditions() {
        return this.conditions;
    }

    /**
     * @return eventBeginTime
     */
    public Long getEventBeginTime() {
        return this.eventBeginTime;
    }

    /**
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return eventEndTime
     */
    public Long getEventEndTime() {
        return this.eventEndTime;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return fileFormat
     */
    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateAnalysisExportTaskRequest, Builder> {
        private String lang; 
        private String columns; 
        private String conditions; 
        private Long eventBeginTime; 
        private String eventCodes; 
        private Long eventEndTime; 
        private String fieldName; 
        private String fieldValue; 
        private String fileFormat; 
        private String regId; 
        private String scope; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateAnalysisExportTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.columns = request.columns;
            this.conditions = request.conditions;
            this.eventBeginTime = request.eventBeginTime;
            this.eventCodes = request.eventCodes;
            this.eventEndTime = request.eventEndTime;
            this.fieldName = request.fieldName;
            this.fieldValue = request.fieldValue;
            this.fileFormat = request.fileFormat;
            this.regId = request.regId;
            this.scope = request.scope;
            this.type = request.type;
        } 

        /**
         * <p>Sets the language type for the request and response messages, with a default value of <strong>zh</strong>. Values:</p>
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
         * <p>Custom columns</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *                 {
         *                     &quot;fieldName&quot;: &quot;requestId&quot;,
         *                     &quot;fieldTitle&quot;: &quot;RequestId&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;eventTime&quot;,
         *                     &quot;fieldTitle&quot;: &quot;事件时间&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;accountId&quot;,
         *                     &quot;fieldTitle&quot;: &quot;账号&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;deviceId&quot;,
         *                     &quot;fieldTitle&quot;: &quot;设备ID&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;eventCode&quot;,
         *                     &quot;fieldTitle&quot;: &quot;事件编码&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;ip&quot;,
         *                     &quot;fieldTitle&quot;: &quot;IP&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;score&quot;,
         *                     &quot;fieldTitle&quot;: &quot;分值&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;tags&quot;,
         *                     &quot;fieldTitle&quot;: &quot;标签&quot;
         *                 },
         *                 {
         *                     &quot;fieldName&quot;: &quot;DEtest222&quot;,
         *                     &quot;fieldTitle&quot;: &quot;测试222&quot;
         *                 }
         *             ]</p>
         */
        public Builder columns(String columns) {
            this.putQueryParameter("columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * <p>Query expression</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *      &quot;fieldName&quot;: null, 
         *       &quot;fieldValue&quot;: null 
         *       }</p>
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>Start time, accurate to milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1752076800000</p>
         */
        public Builder eventBeginTime(Long eventBeginTime) {
            this.putQueryParameter("eventBeginTime", eventBeginTime);
            this.eventBeginTime = eventBeginTime;
            return this;
        }

        /**
         * <p>Event code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>de_afghcf6411</p>
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * <p>End time, accurate to milliseconds (ms).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1753891199000</p>
         */
        public Builder eventEndTime(Long eventEndTime) {
            this.putQueryParameter("eventEndTime", eventEndTime);
            this.eventEndTime = eventEndTime;
            return this;
        }

        /**
         * <p>Field name</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("fieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>Field value</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("fieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * <p>File format, Excel, CSV</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        public Builder fileFormat(String fileFormat) {
            this.putQueryParameter("fileFormat", fileFormat);
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * <p>Region code</p>
         * <p>This parameter is required.</p>
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
         * <p>Export scope: ALL: All, SELECT: Selected rows</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>Type, BASIC: Basic query, ADVANCE: Advanced query, BATCH: Batch query</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateAnalysisExportTaskRequest build() {
            return new CreateAnalysisExportTaskRequest(this);
        } 

    } 

}
