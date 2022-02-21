// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogsListRequest} extends {@link RequestModel}
 *
 * <p>GetLogsListRequest</p>
 */
public class GetLogsListRequest extends Request {
    @Query
    @NameInMap("Date")
    private String date;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private GetLogsListRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.securityToken = builder.securityToken;
        this.startTime = builder.startTime;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogsListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetLogsListRequest, Builder> {
        private String date; 
        private String domain; 
        private String endTime; 
        private String securityToken; 
        private String startTime; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetLogsListRequest response) {
            super(response);
            this.date = response.date;
            this.domain = response.domain;
            this.endTime = response.endTime;
            this.securityToken = response.securityToken;
            this.startTime = response.startTime;
            this.version = response.version;
        } 

        /**
         * Date.
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetLogsListRequest build() {
            return new GetLogsListRequest(this);
        } 

    } 

}
