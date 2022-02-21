// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnConfigGroupDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnConfigGroupDetailResponseBody</p>
 */
public class DescribeDcdnConfigGroupDetailResponseBody extends TeaModel {
    @NameInMap("BizName")
    private String bizName;

    @NameInMap("ConfigGroupId")
    private String configGroupId;

    @NameInMap("ConfigGroupName")
    private String configGroupName;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UpdateTime")
    private String updateTime;

    private DescribeDcdnConfigGroupDetailResponseBody(Builder builder) {
        this.bizName = builder.bizName;
        this.configGroupId = builder.configGroupId;
        this.configGroupName = builder.configGroupName;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnConfigGroupDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return configGroupId
     */
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    /**
     * @return configGroupName
     */
    public String getConfigGroupName() {
        return this.configGroupName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String bizName; 
        private String configGroupId; 
        private String configGroupName; 
        private String createTime; 
        private String description; 
        private String requestId; 
        private String updateTime; 

        /**
         * BizName.
         */
        public Builder bizName(String bizName) {
            this.bizName = bizName;
            return this;
        }

        /**
         * ConfigGroupId.
         */
        public Builder configGroupId(String configGroupId) {
            this.configGroupId = configGroupId;
            return this;
        }

        /**
         * ConfigGroupName.
         */
        public Builder configGroupName(String configGroupName) {
            this.configGroupName = configGroupName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DescribeDcdnConfigGroupDetailResponseBody build() {
            return new DescribeDcdnConfigGroupDetailResponseBody(this);
        } 

    } 

}
