// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGeneratedContentsRequest} extends {@link RequestModel}
 *
 * <p>ListGeneratedContentsRequest</p>
 */
public class ListGeneratedContentsRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("ContentDomain")
    private String contentDomain;

    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    @Body
    @NameInMap("Title")
    private String title;

    private ListGeneratedContentsRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.contentDomain = builder.contentDomain;
        this.current = builder.current;
        this.endTime = builder.endTime;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGeneratedContentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return contentDomain
     */
    public String getContentDomain() {
        return this.contentDomain;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<ListGeneratedContentsRequest, Builder> {
        private String agentKey; 
        private String contentDomain; 
        private Integer current; 
        private String endTime; 
        private Integer size; 
        private String startTime; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(ListGeneratedContentsRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.contentDomain = request.contentDomain;
            this.current = request.current;
            this.endTime = request.endTime;
            this.size = request.size;
            this.startTime = request.startTime;
            this.title = request.title;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * ContentDomain.
         */
        public Builder contentDomain(String contentDomain) {
            this.putBodyParameter("ContentDomain", contentDomain);
            this.contentDomain = contentDomain;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public ListGeneratedContentsRequest build() {
            return new ListGeneratedContentsRequest(this);
        } 

    } 

}
