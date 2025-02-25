// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDataSetTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitDataSetTaskRequest</p>
 */
public class SubmitDataSetTaskRequest extends Request {
    @Body
    @NameInMap("dataSetType")
    @Validation(required = true)
    private Integer dataSetType;

    @Body
    @NameInMap("idType")
    @Validation(required = true)
    private Integer idType;

    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("ossFileName")
    @Validation(required = true)
    private String ossFileName;

    private SubmitDataSetTaskRequest(Builder builder) {
        super(builder);
        this.dataSetType = builder.dataSetType;
        this.idType = builder.idType;
        this.name = builder.name;
        this.ossFileName = builder.ossFileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDataSetTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSetType
     */
    public Integer getDataSetType() {
        return this.dataSetType;
    }

    /**
     * @return idType
     */
    public Integer getIdType() {
        return this.idType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossFileName
     */
    public String getOssFileName() {
        return this.ossFileName;
    }

    public static final class Builder extends Request.Builder<SubmitDataSetTaskRequest, Builder> {
        private Integer dataSetType; 
        private Integer idType; 
        private String name; 
        private String ossFileName; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDataSetTaskRequest request) {
            super(request);
            this.dataSetType = request.dataSetType;
            this.idType = request.idType;
            this.name = request.name;
            this.ossFileName = request.ossFileName;
        } 

        /**
         * dataSetType.
         */
        public Builder dataSetType(Integer dataSetType) {
            this.putBodyParameter("dataSetType", dataSetType);
            this.dataSetType = dataSetType;
            return this;
        }

        /**
         * idType.
         */
        public Builder idType(Integer idType) {
            this.putBodyParameter("idType", idType);
            this.idType = idType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * ossFileName.
         */
        public Builder ossFileName(String ossFileName) {
            this.putBodyParameter("ossFileName", ossFileName);
            this.ossFileName = ossFileName;
            return this;
        }

        @Override
        public SubmitDataSetTaskRequest build() {
            return new SubmitDataSetTaskRequest(this);
        } 

    } 

}
