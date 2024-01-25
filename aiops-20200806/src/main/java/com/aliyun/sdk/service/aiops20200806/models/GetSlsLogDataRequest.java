// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSlsLogDataRequest} extends {@link RequestModel}
 *
 * <p>GetSlsLogDataRequest</p>
 */
public class GetSlsLogDataRequest extends Request {
    @Query
    @NameInMap("Code")
    private String code;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Url")
    private String url;

    private GetSlsLogDataRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.operaUid = builder.operaUid;
        this.startTime = builder.startTime;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSlsLogDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<GetSlsLogDataRequest, Builder> {
        private String code; 
        private String domain; 
        private Long endTime; 
        private String operaUid; 
        private Long startTime; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(GetSlsLogDataRequest request) {
            super(request);
            this.code = request.code;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.operaUid = request.operaUid;
            this.startTime = request.startTime;
            this.url = request.url;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
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
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
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

        @Override
        public GetSlsLogDataRequest build() {
            return new GetSlsLogDataRequest(this);
        } 

    } 

}
