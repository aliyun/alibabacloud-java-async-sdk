// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link DomainAppConfig} extends {@link TeaModel}
 *
 * <p>DomainAppConfig</p>
 */
public class DomainAppConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allow_upload_custom_file_ext_list")
    private java.util.List<String> allowUploadCustomFileExtList;

    @com.aliyun.core.annotation.NameInMap("allow_upload_file_category_list")
    private java.util.List<String> allowUploadFileCategoryList;

    @com.aliyun.core.annotation.NameInMap("same_name_file_upload_mode")
    private String sameNameFileUploadMode;

    @com.aliyun.core.annotation.NameInMap("single_file_upload_size_limit")
    private Long singleFileUploadSizeLimit;

    @com.aliyun.core.annotation.NameInMap("web_client_download_mode")
    private String webClientDownloadMode;

    private DomainAppConfig(Builder builder) {
        this.allowUploadCustomFileExtList = builder.allowUploadCustomFileExtList;
        this.allowUploadFileCategoryList = builder.allowUploadFileCategoryList;
        this.sameNameFileUploadMode = builder.sameNameFileUploadMode;
        this.singleFileUploadSizeLimit = builder.singleFileUploadSizeLimit;
        this.webClientDownloadMode = builder.webClientDownloadMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainAppConfig create() {
        return builder().build();
    }

    /**
     * @return allowUploadCustomFileExtList
     */
    public java.util.List<String> getAllowUploadCustomFileExtList() {
        return this.allowUploadCustomFileExtList;
    }

    /**
     * @return allowUploadFileCategoryList
     */
    public java.util.List<String> getAllowUploadFileCategoryList() {
        return this.allowUploadFileCategoryList;
    }

    /**
     * @return sameNameFileUploadMode
     */
    public String getSameNameFileUploadMode() {
        return this.sameNameFileUploadMode;
    }

    /**
     * @return singleFileUploadSizeLimit
     */
    public Long getSingleFileUploadSizeLimit() {
        return this.singleFileUploadSizeLimit;
    }

    /**
     * @return webClientDownloadMode
     */
    public String getWebClientDownloadMode() {
        return this.webClientDownloadMode;
    }

    public static final class Builder {
        private java.util.List<String> allowUploadCustomFileExtList; 
        private java.util.List<String> allowUploadFileCategoryList; 
        private String sameNameFileUploadMode; 
        private Long singleFileUploadSizeLimit; 
        private String webClientDownloadMode; 

        /**
         * allow_upload_custom_file_ext_list.
         */
        public Builder allowUploadCustomFileExtList(java.util.List<String> allowUploadCustomFileExtList) {
            this.allowUploadCustomFileExtList = allowUploadCustomFileExtList;
            return this;
        }

        /**
         * allow_upload_file_category_list.
         */
        public Builder allowUploadFileCategoryList(java.util.List<String> allowUploadFileCategoryList) {
            this.allowUploadFileCategoryList = allowUploadFileCategoryList;
            return this;
        }

        /**
         * same_name_file_upload_mode.
         */
        public Builder sameNameFileUploadMode(String sameNameFileUploadMode) {
            this.sameNameFileUploadMode = sameNameFileUploadMode;
            return this;
        }

        /**
         * single_file_upload_size_limit.
         */
        public Builder singleFileUploadSizeLimit(Long singleFileUploadSizeLimit) {
            this.singleFileUploadSizeLimit = singleFileUploadSizeLimit;
            return this;
        }

        /**
         * web_client_download_mode.
         */
        public Builder webClientDownloadMode(String webClientDownloadMode) {
            this.webClientDownloadMode = webClientDownloadMode;
            return this;
        }

        public DomainAppConfig build() {
            return new DomainAppConfig(this);
        } 

    } 

}
