// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * columns.
         */
        public Builder columns(String columns) {
            this.putQueryParameter("columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * conditions.
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * eventBeginTime.
         */
        public Builder eventBeginTime(Long eventBeginTime) {
            this.putQueryParameter("eventBeginTime", eventBeginTime);
            this.eventBeginTime = eventBeginTime;
            return this;
        }

        /**
         * eventCodes.
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * eventEndTime.
         */
        public Builder eventEndTime(Long eventEndTime) {
            this.putQueryParameter("eventEndTime", eventEndTime);
            this.eventEndTime = eventEndTime;
            return this;
        }

        /**
         * fieldName.
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("fieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * fieldValue.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("fieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * fileFormat.
         */
        public Builder fileFormat(String fileFormat) {
            this.putQueryParameter("fileFormat", fileFormat);
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * type.
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
