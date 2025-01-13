// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListEnabledExtensionsForProjectRequest} extends {@link RequestModel}
 *
 * <p>ListEnabledExtensionsForProjectRequest</p>
 */
public class ListEnabledExtensionsForProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private ListEnabledExtensionsForProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.eventCode = builder.eventCode;
        this.fileType = builder.fileType;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnabledExtensionsForProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListEnabledExtensionsForProjectRequest, Builder> {
        private String regionId; 
        private String eventCode; 
        private String fileType; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListEnabledExtensionsForProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.eventCode = request.eventCode;
            this.fileType = request.fileType;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The code of the extension point event.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>commit-file</p>
         */
        public Builder eventCode(String eventCode) {
            this.putBodyParameter("EventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * <p>The type of the code for the file.</p>
         * <p>Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> operation to query the type of the code for the file.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console?spm=a2c4g.11186623.0.0.6b4d4941azHd2k">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListEnabledExtensionsForProjectRequest build() {
            return new ListEnabledExtensionsForProjectRequest(this);
        } 

    } 

}
