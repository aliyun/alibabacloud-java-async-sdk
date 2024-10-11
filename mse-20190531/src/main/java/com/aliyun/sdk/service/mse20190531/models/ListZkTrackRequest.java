// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListZkTrackRequest} extends {@link RequestModel}
 *
 * <p>ListZkTrackRequest</p>
 */
public class ListZkTrackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTs;

    private ListZkTrackRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.endTs = builder.endTs;
        this.instanceId = builder.instanceId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.requestPars = builder.requestPars;
        this.reverse = builder.reverse;
        this.sessionId = builder.sessionId;
        this.startTs = builder.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListZkTrackRequest create() {
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
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    public static final class Builder extends Request.Builder<ListZkTrackRequest, Builder> {
        private String acceptLanguage; 
        private Long endTs; 
        private String instanceId; 
        private Long pageNum; 
        private Long pageSize; 
        private String path; 
        private String requestPars; 
        private Boolean reverse; 
        private String sessionId; 
        private Long startTs; 

        private Builder() {
            super();
        } 

        private Builder(ListZkTrackRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.endTs = request.endTs;
            this.instanceId = request.instanceId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.path = request.path;
            this.requestPars = request.requestPars;
            this.reverse = request.reverse;
            this.sessionId = request.sessionId;
            this.startTs = request.startTs;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The end timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1669619383</p>
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-0ju2yq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/path</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * <p>Specifies whether to enable reverse ordering.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0x301fdfbdbf00***</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The start timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1669618483</p>
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        @Override
        public ListZkTrackRequest build() {
            return new ListZkTrackRequest(this);
        } 

    } 

}
