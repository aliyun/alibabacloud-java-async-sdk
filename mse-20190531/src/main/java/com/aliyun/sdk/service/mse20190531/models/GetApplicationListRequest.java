// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationListRequest} extends {@link RequestModel}
 *
 * <p>GetApplicationListRequest</p>
 */
public class GetApplicationListRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("SentinelEnable")
    private Boolean sentinelEnable;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SwitchEnable")
    private Boolean switchEnable;

    private GetApplicationListRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.sentinelEnable = builder.sentinelEnable;
        this.source = builder.source;
        this.switchEnable = builder.switchEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return sentinelEnable
     */
    public Boolean getSentinelEnable() {
        return this.sentinelEnable;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return switchEnable
     */
    public Boolean getSwitchEnable() {
        return this.switchEnable;
    }

    public static final class Builder extends Request.Builder<GetApplicationListRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String appName; 
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String region; 
        private Boolean sentinelEnable; 
        private String source; 
        private Boolean switchEnable; 

        private Builder() {
            super();
        } 

        private Builder(GetApplicationListRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.appName = request.appName;
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.region = request.region;
            this.sentinelEnable = request.sentinelEnable;
            this.source = request.source;
            this.switchEnable = request.switchEnable;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the application.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The programming language of the application, such as Java and Go.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Specifies whether to enable the Sentinel-compatible mode.
         */
        public Builder sentinelEnable(Boolean sentinelEnable) {
            this.putQueryParameter("SentinelEnable", sentinelEnable);
            this.sentinelEnable = sentinelEnable;
            return this;
        }

        /**
         * The source of the application. The value is fixed as edasmsc.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Specifies whether to enable switching.
         */
        public Builder switchEnable(Boolean switchEnable) {
            this.putQueryParameter("SwitchEnable", switchEnable);
            this.switchEnable = switchEnable;
            return this;
        }

        @Override
        public GetApplicationListRequest build() {
            return new GetApplicationListRequest(this);
        } 

    } 

}
