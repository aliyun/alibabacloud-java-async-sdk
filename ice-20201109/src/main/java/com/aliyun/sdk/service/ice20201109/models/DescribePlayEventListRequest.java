// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayEventListRequest</p>
 */
public class DescribePlayEventListRequest extends Request {
    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("PlayTs")
    private String playTs;

    @Query
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    private DescribePlayEventListRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.playTs = builder.playTs;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayEventListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playTs
     */
    public String getPlayTs() {
        return this.playTs;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<DescribePlayEventListRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String playTs; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayEventListRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.playTs = request.playTs;
            this.sessionId = request.sessionId;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PlayTs.
         */
        public Builder playTs(String playTs) {
            this.putQueryParameter("PlayTs", playTs);
            this.playTs = playTs;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public DescribePlayEventListRequest build() {
            return new DescribePlayEventListRequest(this);
        } 

    } 

}
