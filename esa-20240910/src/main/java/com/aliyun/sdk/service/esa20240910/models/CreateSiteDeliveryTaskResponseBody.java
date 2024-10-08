// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSiteDeliveryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSiteDeliveryTaskResponseBody</p>
 */
public class CreateSiteDeliveryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private String siteId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateSiteDeliveryTaskResponseBody(Builder builder) {
        this.dataCenter = builder.dataCenter;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSiteDeliveryTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String dataCenter; 
        private String requestId; 
        private String siteId; 
        private String taskName; 

        /**
         * DataCenter.
         */
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9358E852-992D-5BC7-8BD7-975CA02773A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(String siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public CreateSiteDeliveryTaskResponseBody build() {
            return new CreateSiteDeliveryTaskResponseBody(this);
        } 

    } 

}
