// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetSchemeTaskConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetSchemeTaskConfigResponseBody</p>
 */
public class GetSchemeTaskConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetSchemeTaskConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSchemeTaskConfigResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetSchemeTaskConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Result code. <strong>200</strong> means success.</p>
         * <blockquote>
         * <p>Any other value means failure. The caller can use this field to identify the cause.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response data. See the additional notes below.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error details if the request failed. Returns successful if the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded. Use this field to check the result: true means success, false or null means failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetSchemeTaskConfigResponseBody build() {
            return new GetSchemeTaskConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSchemeTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetSchemeTaskConfigResponseBody</p>
     */
    public static class AssignConfigContests extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private Integer dataType;

        @com.aliyun.core.annotation.NameInMap("ListObject")
        private java.util.List<?> listObject;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Symbol")
        private Integer symbol;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AssignConfigContests(Builder builder) {
            this.dataType = builder.dataType;
            this.listObject = builder.listObject;
            this.name = builder.name;
            this.symbol = builder.symbol;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignConfigContests create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public Integer getDataType() {
            return this.dataType;
        }

        /**
         * @return listObject
         */
        public java.util.List<?> getListObject() {
            return this.listObject;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return symbol
         */
        public Integer getSymbol() {
            return this.symbol;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer dataType; 
            private java.util.List<?> listObject; 
            private String name; 
            private Integer symbol; 
            private String value; 

            private Builder() {
            } 

            private Builder(AssignConfigContests model) {
                this.dataType = model.dataType;
                this.listObject = model.listObject;
                this.name = model.name;
                this.symbol = model.symbol;
                this.value = model.value;
            } 

            /**
             * <p>Type of the value</p>
             * <ul>
             * <li><p>0: String</p>
             * </li>
             * <li><p>1: Number</p>
             * </li>
             * <li><p>2: List (use list type for all parameter values when using =)</p>
             * </li>
             * <li><p>3: Date</p>
             * </li>
             * <li><p>4: List_Json</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder dataType(Integer dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>List of on-the-fly recording data</p>
             */
            public Builder listObject(java.util.List<?> listObject) {
                this.listObject = listObject;
                return this;
            }

            /**
             * <p>Check item name</p>
             * 
             * <strong>example:</strong>
             * <p>callStartTime</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Operator</p>
             * <ul>
             * <li><p>1: ==</p>
             * </li>
             * <li><p>2: &gt;</p>
             * </li>
             * <li><p>3: &lt;</p>
             * </li>
             * <li><p>4: range</p>
             * </li>
             * <li><p>5: &gt;=</p>
             * </li>
             * <li><p>6: &lt;=</p>
             * </li>
             * <li><p>7: !=</p>
             * </li>
             * <li><p>8: null</p>
             * </li>
             * <li><p>9: not null</p>
             * </li>
             * <li><p>10: contains</p>
             * </li>
             * <li><p>11: does not contain</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder symbol(Integer symbol) {
                this.symbol = symbol;
                return this;
            }

            /**
             * <p>Matching value for on-the-fly recording data</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;start\&quot;:\&quot;2022-09-01 00:00:00\&quot;,\&quot;end\&quot;:\&quot;2022-09-30 00:00:00\&quot;}</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AssignConfigContests build() {
                return new AssignConfigContests(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSchemeTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetSchemeTaskConfigResponseBody</p>
     */
    public static class AssignConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignConfigContests")
        private java.util.List<AssignConfigContests> assignConfigContests;

        private AssignConfigs(Builder builder) {
            this.assignConfigContests = builder.assignConfigContests;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignConfigs create() {
            return builder().build();
        }

        /**
         * @return assignConfigContests
         */
        public java.util.List<AssignConfigContests> getAssignConfigContests() {
            return this.assignConfigContests;
        }

        public static final class Builder {
            private java.util.List<AssignConfigContests> assignConfigContests; 

            private Builder() {
            } 

            private Builder(AssignConfigs model) {
                this.assignConfigContests = model.assignConfigContests;
            } 

            /**
             * <p>Parameter matching configurations for on-the-fly recording</p>
             */
            public Builder assignConfigContests(java.util.List<AssignConfigContests> assignConfigContests) {
                this.assignConfigContests = assignConfigContests;
                return this;
            }

            public AssignConfigs build() {
                return new AssignConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSchemeTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetSchemeTaskConfigResponseBody</p>
     */
    public static class DataConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignConfigs")
        private java.util.List<AssignConfigs> assignConfigs;

        @com.aliyun.core.annotation.NameInMap("DataSets")
        private String dataSets;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("ResultParam")
        private String resultParam;

        private DataConfig(Builder builder) {
            this.assignConfigs = builder.assignConfigs;
            this.dataSets = builder.dataSets;
            this.index = builder.index;
            this.resultParam = builder.resultParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataConfig create() {
            return builder().build();
        }

        /**
         * @return assignConfigs
         */
        public java.util.List<AssignConfigs> getAssignConfigs() {
            return this.assignConfigs;
        }

        /**
         * @return dataSets
         */
        public String getDataSets() {
            return this.dataSets;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return resultParam
         */
        public String getResultParam() {
            return this.resultParam;
        }

        public static final class Builder {
            private java.util.List<AssignConfigs> assignConfigs; 
            private String dataSets; 
            private Long index; 
            private String resultParam; 

            private Builder() {
            } 

            private Builder(DataConfig model) {
                this.assignConfigs = model.assignConfigs;
                this.dataSets = model.dataSets;
                this.index = model.index;
                this.resultParam = model.resultParam;
            } 

            /**
             * <p>Data screening items for on-the-fly recording</p>
             */
            public Builder assignConfigs(java.util.List<AssignConfigs> assignConfigs) {
                this.assignConfigs = assignConfigs;
                return this;
            }

            /**
             * <p>Dataset task. Manage datasets.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder dataSets(String dataSets) {
                this.dataSets = dataSets;
                return this;
            }

            /**
             * <p>Index number</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>JSON text for filtering conditions used in secondary quality inspection. For details, see the request parameters of the GetResult API.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder resultParam(String resultParam) {
                this.resultParam = resultParam;
                return this;
            }

            public DataConfig build() {
                return new DataConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSchemeTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetSchemeTaskConfigResponseBody</p>
     */
    public static class SchemeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SchemeId")
        private Long schemeId;

        private SchemeList(Builder builder) {
            this.name = builder.name;
            this.schemeId = builder.schemeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schemeId
         */
        public Long getSchemeId() {
            return this.schemeId;
        }

        public static final class Builder {
            private String name; 
            private Long schemeId; 

            private Builder() {
            } 

            private Builder(SchemeList model) {
                this.name = model.name;
                this.schemeId = model.schemeId;
            } 

            /**
             * <p>Quality inspection scheme name</p>
             * 
             * <strong>example:</strong>
             * <p>质检方案B</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Quality inspection scheme ID</p>
             * 
             * <strong>example:</strong>
             * <p>158</p>
             */
            public Builder schemeId(Long schemeId) {
                this.schemeId = schemeId;
                return this;
            }

            public SchemeList build() {
                return new SchemeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSchemeTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetSchemeTaskConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrTaskPriority")
        private Integer asrTaskPriority;

        @com.aliyun.core.annotation.NameInMap("AssignType")
        private Integer assignType;

        @com.aliyun.core.annotation.NameInMap("DataConfig")
        private DataConfig dataConfig;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ManualReview")
        private Integer manualReview;

        @com.aliyun.core.annotation.NameInMap("ModeCustomizationId")
        private String modeCustomizationId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SchemeIdList")
        private java.util.List<Long> schemeIdList;

        @com.aliyun.core.annotation.NameInMap("SchemeList")
        private java.util.List<SchemeList> schemeList;

        @com.aliyun.core.annotation.NameInMap("SchemeTaskConfigId")
        private Long schemeTaskConfigId;

        @com.aliyun.core.annotation.NameInMap("SourceDataType")
        private String sourceDataType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.asrTaskPriority = builder.asrTaskPriority;
            this.assignType = builder.assignType;
            this.dataConfig = builder.dataConfig;
            this.id = builder.id;
            this.manualReview = builder.manualReview;
            this.modeCustomizationId = builder.modeCustomizationId;
            this.modelName = builder.modelName;
            this.name = builder.name;
            this.schemeIdList = builder.schemeIdList;
            this.schemeList = builder.schemeList;
            this.schemeTaskConfigId = builder.schemeTaskConfigId;
            this.sourceDataType = builder.sourceDataType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asrTaskPriority
         */
        public Integer getAsrTaskPriority() {
            return this.asrTaskPriority;
        }

        /**
         * @return assignType
         */
        public Integer getAssignType() {
            return this.assignType;
        }

        /**
         * @return dataConfig
         */
        public DataConfig getDataConfig() {
            return this.dataConfig;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return manualReview
         */
        public Integer getManualReview() {
            return this.manualReview;
        }

        /**
         * @return modeCustomizationId
         */
        public String getModeCustomizationId() {
            return this.modeCustomizationId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schemeIdList
         */
        public java.util.List<Long> getSchemeIdList() {
            return this.schemeIdList;
        }

        /**
         * @return schemeList
         */
        public java.util.List<SchemeList> getSchemeList() {
            return this.schemeList;
        }

        /**
         * @return schemeTaskConfigId
         */
        public Long getSchemeTaskConfigId() {
            return this.schemeTaskConfigId;
        }

        /**
         * @return sourceDataType
         */
        public String getSourceDataType() {
            return this.sourceDataType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer asrTaskPriority; 
            private Integer assignType; 
            private DataConfig dataConfig; 
            private Long id; 
            private Integer manualReview; 
            private String modeCustomizationId; 
            private String modelName; 
            private String name; 
            private java.util.List<Long> schemeIdList; 
            private java.util.List<SchemeList> schemeList; 
            private Long schemeTaskConfigId; 
            private String sourceDataType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.asrTaskPriority = model.asrTaskPriority;
                this.assignType = model.assignType;
                this.dataConfig = model.dataConfig;
                this.id = model.id;
                this.manualReview = model.manualReview;
                this.modeCustomizationId = model.modeCustomizationId;
                this.modelName = model.modelName;
                this.name = model.name;
                this.schemeIdList = model.schemeIdList;
                this.schemeList = model.schemeList;
                this.schemeTaskConfigId = model.schemeTaskConfigId;
                this.sourceDataType = model.sourceDataType;
                this.status = model.status;
            } 

            /**
             * <p>Task priority:</p>
             * <ul>
             * <li><p>0 (low)</p>
             * </li>
             * <li><p>1 (medium)</p>
             * </li>
             * <li><p>2 (high)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder asrTaskPriority(Integer asrTaskPriority) {
                this.asrTaskPriority = asrTaskPriority;
                return this;
            }

            /**
             * <p>Assignment type</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assignType(Integer assignType) {
                this.assignType = assignType;
                return this;
            }

            /**
             * <p>Data configuration</p>
             */
            public Builder dataConfig(DataConfig dataConfig) {
                this.dataConfig = dataConfig;
                return this;
            }

            /**
             * <p>Quality inspection task ID</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Manual review</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder manualReview(Integer manualReview) {
                this.manualReview = manualReview;
                return this;
            }

            /**
             * <p>Language model ID</p>
             * 
             * <strong>example:</strong>
             * <p>cdae396590b*****ec40f3476e274fc</p>
             */
            public Builder modeCustomizationId(String modeCustomizationId) {
                this.modeCustomizationId = modeCustomizationId;
                return this;
            }

            /**
             * <p>Language model name</p>
             * 
             * <strong>example:</strong>
             * <p>自定义模型</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>Quality inspection task name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Quality inspection scheme IDs</p>
             */
            public Builder schemeIdList(java.util.List<Long> schemeIdList) {
                this.schemeIdList = schemeIdList;
                return this;
            }

            /**
             * <p>Quality inspection schemes</p>
             */
            public Builder schemeList(java.util.List<SchemeList> schemeList) {
                this.schemeList = schemeList;
                return this;
            }

            /**
             * <p>Quality inspection task ID</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder schemeTaskConfigId(Long schemeTaskConfigId) {
                this.schemeTaskConfigId = schemeTaskConfigId;
                return this;
            }

            /**
             * <p>Quality inspection result type:</p>
             * <ul>
             * <li><p>1: offline voice</p>
             * </li>
             * <li><p>2: offline text</p>
             * </li>
             * <li><p>3: real-time voice</p>
             * </li>
             * <li><p>4: real-time text</p>
             * </li>
             * <li><p>5: contact center secondary quality inspection</p>
             * </li>
             * <li><p>51: call center voice secondary quality inspection</p>
             * </li>
             * <li><p>52: call center text secondary quality inspection</p>
             * </li>
             * <li><p>11: dataset voice</p>
             * </li>
             * <li><p>12: dataset text</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceDataType(String sourceDataType) {
                this.sourceDataType = sourceDataType;
                return this;
            }

            /**
             * <p>Enable status. Valid values: 0 (disabled) or 1 (enabled)</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
