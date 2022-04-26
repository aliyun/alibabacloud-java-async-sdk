// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeDeleteExcelRecordRequest} extends {@link RequestModel}
 *
 * <p>RecognizeDeleteExcelRecordRequest</p>
 */
public class RecognizeDeleteExcelRecordRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private RecognizeDeleteExcelRecordRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeDeleteExcelRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<RecognizeDeleteExcelRecordRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeDeleteExcelRecordRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public RecognizeDeleteExcelRecordRequest build() {
            return new RecognizeDeleteExcelRecordRequest(this);
        } 

    } 

}
