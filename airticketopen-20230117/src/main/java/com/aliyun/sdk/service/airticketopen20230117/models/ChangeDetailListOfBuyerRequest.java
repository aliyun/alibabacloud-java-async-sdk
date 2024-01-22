// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeDetailListOfBuyerRequest} extends {@link RequestModel}
 *
 * <p>ChangeDetailListOfBuyerRequest</p>
 */
public class ChangeDetailListOfBuyerRequest extends Request {
    @Query
    @NameInMap("page_index")
    private Integer pageIndex;

    @Query
    @NameInMap("page_size")
    private Integer pageSize;

    @Query
    @NameInMap("utc_create_begin")
    private Long utcCreateBegin;

    @Query
    @NameInMap("utc_create_end")
    private Long utcCreateEnd;

    @Header
    @NameInMap("x-acs-airticket-access-token")
    @Validation(required = true)
    private String xAcsAirticketAccessToken;

    @Header
    @NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private ChangeDetailListOfBuyerRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.utcCreateBegin = builder.utcCreateBegin;
        this.utcCreateEnd = builder.utcCreateEnd;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeDetailListOfBuyerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return utcCreateBegin
     */
    public Long getUtcCreateBegin() {
        return this.utcCreateBegin;
    }

    /**
     * @return utcCreateEnd
     */
    public Long getUtcCreateEnd() {
        return this.utcCreateEnd;
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

    public static final class Builder extends Request.Builder<ChangeDetailListOfBuyerRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long utcCreateBegin; 
        private Long utcCreateEnd; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(ChangeDetailListOfBuyerRequest request) {
            super(request);
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.utcCreateBegin = request.utcCreateBegin;
            this.utcCreateEnd = request.utcCreateEnd;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * page_index.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("page_index", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * utc_create_begin.
         */
        public Builder utcCreateBegin(Long utcCreateBegin) {
            this.putQueryParameter("utc_create_begin", utcCreateBegin);
            this.utcCreateBegin = utcCreateBegin;
            return this;
        }

        /**
         * utc_create_end.
         */
        public Builder utcCreateEnd(Long utcCreateEnd) {
            this.putQueryParameter("utc_create_end", utcCreateEnd);
            this.utcCreateEnd = utcCreateEnd;
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
        public ChangeDetailListOfBuyerRequest build() {
            return new ChangeDetailListOfBuyerRequest(this);
        } 

    } 

}
