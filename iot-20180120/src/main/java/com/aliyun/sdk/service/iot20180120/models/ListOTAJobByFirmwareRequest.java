// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOTAJobByFirmwareRequest} extends {@link RequestModel}
 *
 * <p>ListOTAJobByFirmwareRequest</p>
 */
public class ListOTAJobByFirmwareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firmwareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private ListOTAJobByFirmwareRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.firmwareId = builder.firmwareId;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTAJobByFirmwareRequest create() {
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
     * @return firmwareId
     */
    public String getFirmwareId() {
        return this.firmwareId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListOTAJobByFirmwareRequest, Builder> {
        private Integer currentPage; 
        private String firmwareId; 
        private String iotInstanceId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListOTAJobByFirmwareRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.firmwareId = request.firmwareId;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The number of the page to return. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the update package.</p>
         * <p>An update package ID is returned when you call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create the update package.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/147450.html">ListOTAFirmware</a> operation and view the update package ID in the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FJFx8JzpnhpIsKftRjjm03****</p>
         */
        public Builder firmwareId(String firmwareId) {
            this.putQueryParameter("FirmwareId", firmwareId);
            this.firmwareId = firmwareId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListOTAJobByFirmwareRequest build() {
            return new ListOTAJobByFirmwareRequest(this);
        } 

    } 

}
