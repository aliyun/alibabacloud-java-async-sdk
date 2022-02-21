// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceOptimizeHistoryListRequest} extends {@link RequestModel}
 *
 * <p>GetResourceOptimizeHistoryListRequest</p>
 */
public class GetResourceOptimizeHistoryListRequest extends Request {
    @Query
    @NameInMap("AccessKey")
    private String accessKey;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Signature")
    private String signature;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Uid")
    private String uid;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("__context")
    private String context;

    private GetResourceOptimizeHistoryListRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.signature = builder.signature;
        this.startTime = builder.startTime;
        this.uid = builder.uid;
        this.userId = builder.userId;
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceOptimizeHistoryListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    public static final class Builder extends Request.Builder<GetResourceOptimizeHistoryListRequest, Builder> {
        private String accessKey; 
        private String endTime; 
        private String instanceId; 
        private Integer page; 
        private Integer pageSize; 
        private String signature; 
        private String startTime; 
        private String uid; 
        private String userId; 
        private String context; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceOptimizeHistoryListRequest response) {
            super(response);
            this.accessKey = response.accessKey;
            this.endTime = response.endTime;
            this.instanceId = response.instanceId;
            this.page = response.page;
            this.pageSize = response.pageSize;
            this.signature = response.signature;
            this.startTime = response.startTime;
            this.uid = response.uid;
            this.userId = response.userId;
            this.context = response.context;
        } 

        /**
         * AccessKey.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
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
         * Signature.
         */
        public Builder signature(String signature) {
            this.putQueryParameter("Signature", signature);
            this.signature = signature;
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
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * __context.
         */
        public Builder context(String context) {
            this.putQueryParameter("__context", context);
            this.context = context;
            return this;
        }

        @Override
        public GetResourceOptimizeHistoryListRequest build() {
            return new GetResourceOptimizeHistoryListRequest(this);
        } 

    } 

}
