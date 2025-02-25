// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSourceDataDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataSourceDataDownloadUrlRequest</p>
 */
public class DescribeDataSourceDataDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    private DescribeDataSourceDataDownloadUrlRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.dataSourceId = builder.dataSourceId;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourceDataDownloadUrlRequest create() {
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
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeDataSourceDataDownloadUrlRequest, Builder> {
        private String lang; 
        private Long dataSourceId; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataSourceDataDownloadUrlRequest request) {
            super(request);
            this.lang = request.lang;
            this.dataSourceId = request.dataSourceId;
            this.regId = request.regId;
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
         * dataSourceId.
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
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

        @Override
        public DescribeDataSourceDataDownloadUrlRequest build() {
            return new DescribeDataSourceDataDownloadUrlRequest(this);
        } 

    } 

}
