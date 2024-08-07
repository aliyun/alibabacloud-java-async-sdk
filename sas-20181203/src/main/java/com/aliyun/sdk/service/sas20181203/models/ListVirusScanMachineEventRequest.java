// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirusScanMachineEventRequest} extends {@link RequestModel}
 *
 * <p>ListVirusScanMachineEventRequest</p>
 */
public class ListVirusScanMachineEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateTaskId")
    private String operateTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListVirusScanMachineEventRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.operateTaskId = builder.operateTaskId;
        this.pageSize = builder.pageSize;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanMachineEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operateTaskId
     */
    public String getOperateTaskId() {
        return this.operateTaskId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListVirusScanMachineEventRequest, Builder> {
        private Integer currentPage; 
        private String lang; 
        private String operateTaskId; 
        private Integer pageSize; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListVirusScanMachineEventRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.operateTaskId = request.operateTaskId;
            this.pageSize = request.pageSize;
            this.uuid = request.uuid;
        } 

        /**
         * The page number.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The task ID that is generated by the handling operation.
         * <p>
         * 
         * >  You can call the [OperateVirusEvents](~~OperateVirusEvents~~) operation to handle alerts. You can obtain the task ID from the response parameters.
         */
        public Builder operateTaskId(String operateTaskId) {
            this.putQueryParameter("OperateTaskId", operateTaskId);
            this.operateTaskId = operateTaskId;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The UUID of the server.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListVirusScanMachineEventRequest build() {
            return new ListVirusScanMachineEventRequest(this);
        } 

    } 

}
