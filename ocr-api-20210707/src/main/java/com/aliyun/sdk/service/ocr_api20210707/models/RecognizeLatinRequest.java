// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeLatinRequest} extends {@link RequestModel}
 *
 * <p>RecognizeLatinRequest</p>
 */
public class RecognizeLatinRequest extends Request {
    @Query
    @NameInMap("NeedRotate")
    private Boolean needRotate;

    @Query
    @NameInMap("OutputCharInfo")
    private Boolean outputCharInfo;

    @Query
    @NameInMap("OutputTable")
    private Boolean outputTable;

    @Query
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeLatinRequest(Builder builder) {
        super(builder);
        this.needRotate = builder.needRotate;
        this.outputCharInfo = builder.outputCharInfo;
        this.outputTable = builder.outputTable;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeLatinRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return needRotate
     */
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    /**
     * @return outputCharInfo
     */
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    /**
     * @return outputTable
     */
    public Boolean getOutputTable() {
        return this.outputTable;
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

    public static final class Builder extends Request.Builder<RecognizeLatinRequest, Builder> {
        private Boolean needRotate; 
        private Boolean outputCharInfo; 
        private Boolean outputTable; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeLatinRequest request) {
            super(request);
            this.needRotate = request.needRotate;
            this.outputCharInfo = request.outputCharInfo;
            this.outputTable = request.outputTable;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * NeedRotate.
         */
        public Builder needRotate(Boolean needRotate) {
            this.putQueryParameter("NeedRotate", needRotate);
            this.needRotate = needRotate;
            return this;
        }

        /**
         * OutputCharInfo.
         */
        public Builder outputCharInfo(Boolean outputCharInfo) {
            this.putQueryParameter("OutputCharInfo", outputCharInfo);
            this.outputCharInfo = outputCharInfo;
            return this;
        }

        /**
         * OutputTable.
         */
        public Builder outputTable(Boolean outputTable) {
            this.putQueryParameter("OutputTable", outputTable);
            this.outputTable = outputTable;
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
        public RecognizeLatinRequest build() {
            return new RecognizeLatinRequest(this);
        } 

    } 

}
