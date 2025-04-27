// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

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
 * {@link RecognizeAllTextRequest} extends {@link RequestModel}
 *
 * <p>RecognizeAllTextRequest</p>
 */
public class RecognizeAllTextRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedConfig")
    private AdvancedConfig advancedConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdCardConfig")
    private IdCardConfig idCardConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternationalBusinessLicenseConfig")
    private InternationalBusinessLicenseConfig internationalBusinessLicenseConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternationalIdCardConfig")
    private InternationalIdCardConfig internationalIdCardConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiLanConfig")
    private MultiLanConfig multiLanConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputBarCode")
    private Boolean outputBarCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputCoordinate")
    private String outputCoordinate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputFigure")
    private Boolean outputFigure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputKVExcel")
    private Boolean outputKVExcel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputOricoord")
    private Boolean outputOricoord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputQrcode")
    private Boolean outputQrcode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputStamp")
    private Boolean outputStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableConfig")
    private TableConfig tableConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    private RecognizeAllTextRequest(Builder builder) {
        super(builder);
        this.advancedConfig = builder.advancedConfig;
        this.idCardConfig = builder.idCardConfig;
        this.internationalBusinessLicenseConfig = builder.internationalBusinessLicenseConfig;
        this.internationalIdCardConfig = builder.internationalIdCardConfig;
        this.multiLanConfig = builder.multiLanConfig;
        this.outputBarCode = builder.outputBarCode;
        this.outputCoordinate = builder.outputCoordinate;
        this.outputFigure = builder.outputFigure;
        this.outputKVExcel = builder.outputKVExcel;
        this.outputOricoord = builder.outputOricoord;
        this.outputQrcode = builder.outputQrcode;
        this.outputStamp = builder.outputStamp;
        this.pageNo = builder.pageNo;
        this.tableConfig = builder.tableConfig;
        this.type = builder.type;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeAllTextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedConfig
     */
    public AdvancedConfig getAdvancedConfig() {
        return this.advancedConfig;
    }

    /**
     * @return idCardConfig
     */
    public IdCardConfig getIdCardConfig() {
        return this.idCardConfig;
    }

    /**
     * @return internationalBusinessLicenseConfig
     */
    public InternationalBusinessLicenseConfig getInternationalBusinessLicenseConfig() {
        return this.internationalBusinessLicenseConfig;
    }

    /**
     * @return internationalIdCardConfig
     */
    public InternationalIdCardConfig getInternationalIdCardConfig() {
        return this.internationalIdCardConfig;
    }

    /**
     * @return multiLanConfig
     */
    public MultiLanConfig getMultiLanConfig() {
        return this.multiLanConfig;
    }

    /**
     * @return outputBarCode
     */
    public Boolean getOutputBarCode() {
        return this.outputBarCode;
    }

    /**
     * @return outputCoordinate
     */
    public String getOutputCoordinate() {
        return this.outputCoordinate;
    }

    /**
     * @return outputFigure
     */
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    /**
     * @return outputKVExcel
     */
    public Boolean getOutputKVExcel() {
        return this.outputKVExcel;
    }

    /**
     * @return outputOricoord
     */
    public Boolean getOutputOricoord() {
        return this.outputOricoord;
    }

    /**
     * @return outputQrcode
     */
    public Boolean getOutputQrcode() {
        return this.outputQrcode;
    }

    /**
     * @return outputStamp
     */
    public Boolean getOutputStamp() {
        return this.outputStamp;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return tableConfig
     */
    public TableConfig getTableConfig() {
        return this.tableConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RecognizeAllTextRequest, Builder> {
        private AdvancedConfig advancedConfig; 
        private IdCardConfig idCardConfig; 
        private InternationalBusinessLicenseConfig internationalBusinessLicenseConfig; 
        private InternationalIdCardConfig internationalIdCardConfig; 
        private MultiLanConfig multiLanConfig; 
        private Boolean outputBarCode; 
        private String outputCoordinate; 
        private Boolean outputFigure; 
        private Boolean outputKVExcel; 
        private Boolean outputOricoord; 
        private Boolean outputQrcode; 
        private Boolean outputStamp; 
        private Integer pageNo; 
        private TableConfig tableConfig; 
        private String type; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeAllTextRequest request) {
            super(request);
            this.advancedConfig = request.advancedConfig;
            this.idCardConfig = request.idCardConfig;
            this.internationalBusinessLicenseConfig = request.internationalBusinessLicenseConfig;
            this.internationalIdCardConfig = request.internationalIdCardConfig;
            this.multiLanConfig = request.multiLanConfig;
            this.outputBarCode = request.outputBarCode;
            this.outputCoordinate = request.outputCoordinate;
            this.outputFigure = request.outputFigure;
            this.outputKVExcel = request.outputKVExcel;
            this.outputOricoord = request.outputOricoord;
            this.outputQrcode = request.outputQrcode;
            this.outputStamp = request.outputStamp;
            this.pageNo = request.pageNo;
            this.tableConfig = request.tableConfig;
            this.type = request.type;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * AdvancedConfig.
         */
        public Builder advancedConfig(AdvancedConfig advancedConfig) {
            String advancedConfigShrink = shrink(advancedConfig, "AdvancedConfig", "json");
            this.putQueryParameter("AdvancedConfig", advancedConfigShrink);
            this.advancedConfig = advancedConfig;
            return this;
        }

        /**
         * IdCardConfig.
         */
        public Builder idCardConfig(IdCardConfig idCardConfig) {
            String idCardConfigShrink = shrink(idCardConfig, "IdCardConfig", "json");
            this.putQueryParameter("IdCardConfig", idCardConfigShrink);
            this.idCardConfig = idCardConfig;
            return this;
        }

        /**
         * InternationalBusinessLicenseConfig.
         */
        public Builder internationalBusinessLicenseConfig(InternationalBusinessLicenseConfig internationalBusinessLicenseConfig) {
            String internationalBusinessLicenseConfigShrink = shrink(internationalBusinessLicenseConfig, "InternationalBusinessLicenseConfig", "json");
            this.putQueryParameter("InternationalBusinessLicenseConfig", internationalBusinessLicenseConfigShrink);
            this.internationalBusinessLicenseConfig = internationalBusinessLicenseConfig;
            return this;
        }

        /**
         * InternationalIdCardConfig.
         */
        public Builder internationalIdCardConfig(InternationalIdCardConfig internationalIdCardConfig) {
            String internationalIdCardConfigShrink = shrink(internationalIdCardConfig, "InternationalIdCardConfig", "json");
            this.putQueryParameter("InternationalIdCardConfig", internationalIdCardConfigShrink);
            this.internationalIdCardConfig = internationalIdCardConfig;
            return this;
        }

        /**
         * MultiLanConfig.
         */
        public Builder multiLanConfig(MultiLanConfig multiLanConfig) {
            String multiLanConfigShrink = shrink(multiLanConfig, "MultiLanConfig", "json");
            this.putQueryParameter("MultiLanConfig", multiLanConfigShrink);
            this.multiLanConfig = multiLanConfig;
            return this;
        }

        /**
         * OutputBarCode.
         */
        public Builder outputBarCode(Boolean outputBarCode) {
            this.putQueryParameter("OutputBarCode", outputBarCode);
            this.outputBarCode = outputBarCode;
            return this;
        }

        /**
         * OutputCoordinate.
         */
        public Builder outputCoordinate(String outputCoordinate) {
            this.putQueryParameter("OutputCoordinate", outputCoordinate);
            this.outputCoordinate = outputCoordinate;
            return this;
        }

        /**
         * OutputFigure.
         */
        public Builder outputFigure(Boolean outputFigure) {
            this.putQueryParameter("OutputFigure", outputFigure);
            this.outputFigure = outputFigure;
            return this;
        }

        /**
         * OutputKVExcel.
         */
        public Builder outputKVExcel(Boolean outputKVExcel) {
            this.putQueryParameter("OutputKVExcel", outputKVExcel);
            this.outputKVExcel = outputKVExcel;
            return this;
        }

        /**
         * OutputOricoord.
         */
        public Builder outputOricoord(Boolean outputOricoord) {
            this.putQueryParameter("OutputOricoord", outputOricoord);
            this.outputOricoord = outputOricoord;
            return this;
        }

        /**
         * OutputQrcode.
         */
        public Builder outputQrcode(Boolean outputQrcode) {
            this.putQueryParameter("OutputQrcode", outputQrcode);
            this.outputQrcode = outputQrcode;
            return this;
        }

        /**
         * OutputStamp.
         */
        public Builder outputStamp(Boolean outputStamp) {
            this.putQueryParameter("OutputStamp", outputStamp);
            this.outputStamp = outputStamp;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * TableConfig.
         */
        public Builder tableConfig(TableConfig tableConfig) {
            String tableConfigShrink = shrink(tableConfig, "TableConfig", "json");
            this.putQueryParameter("TableConfig", tableConfigShrink);
            this.tableConfig = tableConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Advanced</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RecognizeAllTextRequest build() {
            return new RecognizeAllTextRequest(this);
        } 

    } 

    /**
     * 
     * {@link RecognizeAllTextRequest} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextRequest</p>
     */
    public static class AdvancedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsHandWritingTable")
        private Boolean isHandWritingTable;

        @com.aliyun.core.annotation.NameInMap("IsLineLessTable")
        private Boolean isLineLessTable;

        @com.aliyun.core.annotation.NameInMap("OutputCharInfo")
        private Boolean outputCharInfo;

        @com.aliyun.core.annotation.NameInMap("OutputParagraph")
        private Boolean outputParagraph;

        @com.aliyun.core.annotation.NameInMap("OutputRow")
        private Boolean outputRow;

        @com.aliyun.core.annotation.NameInMap("OutputTable")
        private Boolean outputTable;

        @com.aliyun.core.annotation.NameInMap("OutputTableExcel")
        private Boolean outputTableExcel;

        @com.aliyun.core.annotation.NameInMap("OutputTableHtml")
        private Boolean outputTableHtml;

        private AdvancedConfig(Builder builder) {
            this.isHandWritingTable = builder.isHandWritingTable;
            this.isLineLessTable = builder.isLineLessTable;
            this.outputCharInfo = builder.outputCharInfo;
            this.outputParagraph = builder.outputParagraph;
            this.outputRow = builder.outputRow;
            this.outputTable = builder.outputTable;
            this.outputTableExcel = builder.outputTableExcel;
            this.outputTableHtml = builder.outputTableHtml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedConfig create() {
            return builder().build();
        }

        /**
         * @return isHandWritingTable
         */
        public Boolean getIsHandWritingTable() {
            return this.isHandWritingTable;
        }

        /**
         * @return isLineLessTable
         */
        public Boolean getIsLineLessTable() {
            return this.isLineLessTable;
        }

        /**
         * @return outputCharInfo
         */
        public Boolean getOutputCharInfo() {
            return this.outputCharInfo;
        }

        /**
         * @return outputParagraph
         */
        public Boolean getOutputParagraph() {
            return this.outputParagraph;
        }

        /**
         * @return outputRow
         */
        public Boolean getOutputRow() {
            return this.outputRow;
        }

        /**
         * @return outputTable
         */
        public Boolean getOutputTable() {
            return this.outputTable;
        }

        /**
         * @return outputTableExcel
         */
        public Boolean getOutputTableExcel() {
            return this.outputTableExcel;
        }

        /**
         * @return outputTableHtml
         */
        public Boolean getOutputTableHtml() {
            return this.outputTableHtml;
        }

        public static final class Builder {
            private Boolean isHandWritingTable; 
            private Boolean isLineLessTable; 
            private Boolean outputCharInfo; 
            private Boolean outputParagraph; 
            private Boolean outputRow; 
            private Boolean outputTable; 
            private Boolean outputTableExcel; 
            private Boolean outputTableHtml; 

            private Builder() {
            } 

            private Builder(AdvancedConfig model) {
                this.isHandWritingTable = model.isHandWritingTable;
                this.isLineLessTable = model.isLineLessTable;
                this.outputCharInfo = model.outputCharInfo;
                this.outputParagraph = model.outputParagraph;
                this.outputRow = model.outputRow;
                this.outputTable = model.outputTable;
                this.outputTableExcel = model.outputTableExcel;
                this.outputTableHtml = model.outputTableHtml;
            } 

            /**
             * IsHandWritingTable.
             */
            public Builder isHandWritingTable(Boolean isHandWritingTable) {
                this.isHandWritingTable = isHandWritingTable;
                return this;
            }

            /**
             * IsLineLessTable.
             */
            public Builder isLineLessTable(Boolean isLineLessTable) {
                this.isLineLessTable = isLineLessTable;
                return this;
            }

            /**
             * OutputCharInfo.
             */
            public Builder outputCharInfo(Boolean outputCharInfo) {
                this.outputCharInfo = outputCharInfo;
                return this;
            }

            /**
             * OutputParagraph.
             */
            public Builder outputParagraph(Boolean outputParagraph) {
                this.outputParagraph = outputParagraph;
                return this;
            }

            /**
             * OutputRow.
             */
            public Builder outputRow(Boolean outputRow) {
                this.outputRow = outputRow;
                return this;
            }

            /**
             * OutputTable.
             */
            public Builder outputTable(Boolean outputTable) {
                this.outputTable = outputTable;
                return this;
            }

            /**
             * OutputTableExcel.
             */
            public Builder outputTableExcel(Boolean outputTableExcel) {
                this.outputTableExcel = outputTableExcel;
                return this;
            }

            /**
             * OutputTableHtml.
             */
            public Builder outputTableHtml(Boolean outputTableHtml) {
                this.outputTableHtml = outputTableHtml;
                return this;
            }

            public AdvancedConfig build() {
                return new AdvancedConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextRequest} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextRequest</p>
     */
    public static class IdCardConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Llm_rec")
        private Boolean llmRec;

        @com.aliyun.core.annotation.NameInMap("OutputIdCardQuality")
        private Boolean outputIdCardQuality;

        private IdCardConfig(Builder builder) {
            this.llmRec = builder.llmRec;
            this.outputIdCardQuality = builder.outputIdCardQuality;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdCardConfig create() {
            return builder().build();
        }

        /**
         * @return llmRec
         */
        public Boolean getLlmRec() {
            return this.llmRec;
        }

        /**
         * @return outputIdCardQuality
         */
        public Boolean getOutputIdCardQuality() {
            return this.outputIdCardQuality;
        }

        public static final class Builder {
            private Boolean llmRec; 
            private Boolean outputIdCardQuality; 

            private Builder() {
            } 

            private Builder(IdCardConfig model) {
                this.llmRec = model.llmRec;
                this.outputIdCardQuality = model.outputIdCardQuality;
            } 

            /**
             * Llm_rec.
             */
            public Builder llmRec(Boolean llmRec) {
                this.llmRec = llmRec;
                return this;
            }

            /**
             * OutputIdCardQuality.
             */
            public Builder outputIdCardQuality(Boolean outputIdCardQuality) {
                this.outputIdCardQuality = outputIdCardQuality;
                return this;
            }

            public IdCardConfig build() {
                return new IdCardConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextRequest} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextRequest</p>
     */
    public static class InternationalBusinessLicenseConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        private InternationalBusinessLicenseConfig(Builder builder) {
            this.country = builder.country;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternationalBusinessLicenseConfig create() {
            return builder().build();
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        public static final class Builder {
            private String country; 

            private Builder() {
            } 

            private Builder(InternationalBusinessLicenseConfig model) {
                this.country = model.country;
            } 

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            public InternationalBusinessLicenseConfig build() {
                return new InternationalBusinessLicenseConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextRequest} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextRequest</p>
     */
    public static class InternationalIdCardConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        private InternationalIdCardConfig(Builder builder) {
            this.country = builder.country;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternationalIdCardConfig create() {
            return builder().build();
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        public static final class Builder {
            private String country; 

            private Builder() {
            } 

            private Builder(InternationalIdCardConfig model) {
                this.country = model.country;
            } 

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            public InternationalIdCardConfig build() {
                return new InternationalIdCardConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextRequest} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextRequest</p>
     */
    public static class MultiLanConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Languages")
        private String languages;

        private MultiLanConfig(Builder builder) {
            this.languages = builder.languages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiLanConfig create() {
            return builder().build();
        }

        /**
         * @return languages
         */
        public String getLanguages() {
            return this.languages;
        }

        public static final class Builder {
            private String languages; 

            private Builder() {
            } 

            private Builder(MultiLanConfig model) {
                this.languages = model.languages;
            } 

            /**
             * Languages.
             */
            public Builder languages(String languages) {
                this.languages = languages;
                return this;
            }

            public MultiLanConfig build() {
                return new MultiLanConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeAllTextRequest} extends {@link TeaModel}
     *
     * <p>RecognizeAllTextRequest</p>
     */
    public static class TableConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsHandWritingTable")
        private Boolean isHandWritingTable;

        @com.aliyun.core.annotation.NameInMap("IsLineLessTable")
        private Boolean isLineLessTable;

        @com.aliyun.core.annotation.NameInMap("OutputTableExcel")
        private Boolean outputTableExcel;

        @com.aliyun.core.annotation.NameInMap("OutputTableHtml")
        private Boolean outputTableHtml;

        private TableConfig(Builder builder) {
            this.isHandWritingTable = builder.isHandWritingTable;
            this.isLineLessTable = builder.isLineLessTable;
            this.outputTableExcel = builder.outputTableExcel;
            this.outputTableHtml = builder.outputTableHtml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableConfig create() {
            return builder().build();
        }

        /**
         * @return isHandWritingTable
         */
        public Boolean getIsHandWritingTable() {
            return this.isHandWritingTable;
        }

        /**
         * @return isLineLessTable
         */
        public Boolean getIsLineLessTable() {
            return this.isLineLessTable;
        }

        /**
         * @return outputTableExcel
         */
        public Boolean getOutputTableExcel() {
            return this.outputTableExcel;
        }

        /**
         * @return outputTableHtml
         */
        public Boolean getOutputTableHtml() {
            return this.outputTableHtml;
        }

        public static final class Builder {
            private Boolean isHandWritingTable; 
            private Boolean isLineLessTable; 
            private Boolean outputTableExcel; 
            private Boolean outputTableHtml; 

            private Builder() {
            } 

            private Builder(TableConfig model) {
                this.isHandWritingTable = model.isHandWritingTable;
                this.isLineLessTable = model.isLineLessTable;
                this.outputTableExcel = model.outputTableExcel;
                this.outputTableHtml = model.outputTableHtml;
            } 

            /**
             * IsHandWritingTable.
             */
            public Builder isHandWritingTable(Boolean isHandWritingTable) {
                this.isHandWritingTable = isHandWritingTable;
                return this;
            }

            /**
             * IsLineLessTable.
             */
            public Builder isLineLessTable(Boolean isLineLessTable) {
                this.isLineLessTable = isLineLessTable;
                return this;
            }

            /**
             * OutputTableExcel.
             */
            public Builder outputTableExcel(Boolean outputTableExcel) {
                this.outputTableExcel = outputTableExcel;
                return this;
            }

            /**
             * OutputTableHtml.
             */
            public Builder outputTableHtml(Boolean outputTableHtml) {
                this.outputTableHtml = outputTableHtml;
                return this;
            }

            public TableConfig build() {
                return new TableConfig(this);
            } 

        } 

    }
}
