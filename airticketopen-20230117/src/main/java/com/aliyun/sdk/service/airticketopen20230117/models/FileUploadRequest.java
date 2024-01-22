// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileUploadRequest} extends {@link RequestModel}
 *
 * <p>FileUploadRequest</p>
 */
public class FileUploadRequest extends Request {
    @Body
    @NameInMap("file_content")
    @Validation(required = true)
    private String fileContent;

    @Body
    @NameInMap("order_num")
    @Validation(required = true)
    private Long orderNum;

    @Header
    @NameInMap("x-acs-airticket-access-token")
    @Validation(required = true)
    private String xAcsAirticketAccessToken;

    @Header
    @NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private FileUploadRequest(Builder builder) {
        super(builder);
        this.fileContent = builder.fileContent;
        this.orderNum = builder.orderNum;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileUploadRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileContent
     */
    public String getFileContent() {
        return this.fileContent;
    }

    /**
     * @return orderNum
     */
    public Long getOrderNum() {
        return this.orderNum;
    }

    /**
     * @return xAcsAirticketAccessToken
     */
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    /**
     * @return xAcsAirticketLanguage
     */
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

    public static final class Builder extends Request.Builder<FileUploadRequest, Builder> {
        private String fileContent; 
        private Long orderNum; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(FileUploadRequest request) {
            super(request);
            this.fileContent = request.fileContent;
            this.orderNum = request.orderNum;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * file_content.
         */
        public Builder fileContent(String fileContent) {
            this.putBodyParameter("file_content", fileContent);
            this.fileContent = fileContent;
            return this;
        }

        /**
         * order_num.
         */
        public Builder orderNum(Long orderNum) {
            this.putBodyParameter("order_num", orderNum);
            this.orderNum = orderNum;
            return this;
        }

        /**
         * access_token
         */
        public Builder xAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
            this.putHeaderParameter("x-acs-airticket-access-token", xAcsAirticketAccessToken);
            this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
            return this;
        }

        /**
         * x-acs-airticket-language.
         */
        public Builder xAcsAirticketLanguage(String xAcsAirticketLanguage) {
            this.putHeaderParameter("x-acs-airticket-language", xAcsAirticketLanguage);
            this.xAcsAirticketLanguage = xAcsAirticketLanguage;
            return this;
        }

        @Override
        public FileUploadRequest build() {
            return new FileUploadRequest(this);
        } 

    } 

}
