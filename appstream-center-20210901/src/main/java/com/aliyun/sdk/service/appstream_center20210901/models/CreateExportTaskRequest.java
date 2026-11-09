// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateExportTaskRequest</p>
 */
public class CreateExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportFields")
    private java.util.List<String> exportFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryParamJson")
    private String queryParamJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private CreateExportTaskRequest(Builder builder) {
        super(builder);
        this.exportFields = builder.exportFields;
        this.queryParamJson = builder.queryParamJson;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportFields
     */
    public java.util.List<String> getExportFields() {
        return this.exportFields;
    }

    /**
     * @return queryParamJson
     */
    public String getQueryParamJson() {
        return this.queryParamJson;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateExportTaskRequest, Builder> {
        private java.util.List<String> exportFields; 
        private String queryParamJson; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateExportTaskRequest request) {
            super(request);
            this.exportFields = request.exportFields;
            this.queryParamJson = request.queryParamJson;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The list of field codes for the export columns. This parameter is optional and applies only to WUYING_SERVER_LIST. Do not pass this parameter for other task types. You can pass up to 100 elements. The codes are case-sensitive. Leading and trailing whitespace in fields is removed, and blank elements are ignored. Duplicate codes are retained in the order of their first appearance. WuyingServerId is always the first column, and the remaining columns are exported in the order of the request. If this parameter is not passed, only WuyingServerId is exported.</p>
         * <p>Supported codes: WuyingServerId, WuyingServerName, Status, BizRegionId, ZoneId, OfficeSiteId, ServerInstanceType, ServerInstanceTypeId, Cpu, Memory, Image, OsType, ImageId, SystemDisk, DataDisks, NetworkInterfaceIp, PrivateIpSets, SecurityGroupIds, Bandwidth, ChargeType, SubPayType, VirtualNodePool, CreateTime, ExpiredTime, and VirtualKubeletInfo.</p>
         * <p>In the original RPC request, pass the values sequentially by using ExportFields.1, ExportFields.2, and so on. For example, ExportFields.1=WuyingServerId and ExportFields.2=Status.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;WuyingServerId&quot;,&quot;Status&quot;]</p>
         */
        public Builder exportFields(java.util.List<String> exportFields) {
            this.putBodyParameter("ExportFields", exportFields);
            this.exportFields = exportFields;
            return this;
        }

        /**
         * <p>The JSON string serialized from the query condition object. This parameter is required and cannot be an empty string. Field names must use the following lower camel case format.</p>
         * <ul>
         * <li>WUYING_SERVER_LIST: If no filter condition is specified, pass the JSON string corresponding to {}. Only wuyingServerIdList, wuyingServerNameOrId, status, bizRegionId, zoneId, officeSiteId, serverInstanceType, imageId, chargeType, virtualNodePoolId, addVirtualNodePoolStatusList, users, networkInterfaceIp, createTimeStart, createTimeEnd, expiredTimeStart, and expiredTimeEnd are supported. The semantics of each field are the same as those in ListWuyingServer. Pagination or other unlisted fields cannot be passed. The values of wuyingServerIdList, addVirtualNodePoolStatusList, and users must be serialized into JSON array strings before the outer query object is serialized.</li>
         * <li>BROWSER_BOOKMARK_LIST and BROWSER_RESTRICTED_URL_LIST: The object must and can only contain browserInstanceGroupId, and the value must be a non-empty cloud browser delivery group ID string. It cannot contain Keyword, pagination, or other fields.</li>
         * <li>USER_USAGE_REPORT: Use productType, startDate, and endDate to specify the product type and query time range. You can use appInstanceGroupId, bizRegionId, userId, and connectionStatus for filtering. startDate and endDate must be in the yyyy-MM-dd HH:mm:ss format. Query parameters are parsed and verified during the asynchronous execution phase. A successful creation does not mean that all these query conditions have passed the verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizRegionId&quot;:&quot;cn-hangzhou&quot;,&quot;zoneId&quot;:&quot;cn-hangzhou-h&quot;}</p>
         */
        public Builder queryParamJson(String queryParamJson) {
            this.putBodyParameter("QueryParamJson", queryParamJson);
            this.queryParamJson = queryParamJson;
            return this;
        }

        /**
         * <p>The type of the export task. This parameter is required and case-sensitive. Valid values:</p>
         * <ul>
         * <li>WUYING_SERVER_LIST: WUYING server list.</li>
         * <li>USER_USAGE_REPORT: user usage report.</li>
         * <li>BROWSER_BOOKMARK_LIST: cloud browser bookmark list.</li>
         * <li>BROWSER_RESTRICTED_URL_LIST: cloud browser URL whitelist.</li>
         * </ul>
         * <p>Different task types use different QueryParamJson query conditions. Only WUYING_SERVER_LIST supports selecting export columns by using ExportFields.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING_SERVER_LIST</p>
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateExportTaskRequest build() {
            return new CreateExportTaskRequest(this);
        } 

    } 

}
