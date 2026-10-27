// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreateRplInspectionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRplInspectionTaskRequest</p>
 */
public class CreateRplInspectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstDb")
    private String dstDb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstPassword")
    private String dstPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstResId")
    private String dstResId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstUserName")
    private String dstUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slinkTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPassword")
    private String srcPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcUserName")
    private String srcUserName;

    private CreateRplInspectionTaskRequest(Builder builder) {
        super(builder);
        this.dstDb = builder.dstDb;
        this.dstPassword = builder.dstPassword;
        this.dstResId = builder.dstResId;
        this.dstUserName = builder.dstUserName;
        this.regionId = builder.regionId;
        this.slinkTaskId = builder.slinkTaskId;
        this.srcPassword = builder.srcPassword;
        this.srcUserName = builder.srcUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRplInspectionTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dstDb
     */
    public String getDstDb() {
        return this.dstDb;
    }

    /**
     * @return dstPassword
     */
    public String getDstPassword() {
        return this.dstPassword;
    }

    /**
     * @return dstResId
     */
    public String getDstResId() {
        return this.dstResId;
    }

    /**
     * @return dstUserName
     */
    public String getDstUserName() {
        return this.dstUserName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slinkTaskId
     */
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    /**
     * @return srcPassword
     */
    public String getSrcPassword() {
        return this.srcPassword;
    }

    /**
     * @return srcUserName
     */
    public String getSrcUserName() {
        return this.srcUserName;
    }

    public static final class Builder extends Request.Builder<CreateRplInspectionTaskRequest, Builder> {
        private String dstDb; 
        private String dstPassword; 
        private String dstResId; 
        private String dstUserName; 
        private String regionId; 
        private String slinkTaskId; 
        private String srcPassword; 
        private String srcUserName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRplInspectionTaskRequest request) {
            super(request);
            this.dstDb = request.dstDb;
            this.dstPassword = request.dstPassword;
            this.dstResId = request.dstResId;
            this.dstUserName = request.dstUserName;
            this.regionId = request.regionId;
            this.slinkTaskId = request.slinkTaskId;
            this.srcPassword = request.srcPassword;
            this.srcUserName = request.srcUserName;
        } 

        /**
         * <p>The ID of the ApsaraDB RDS instance to which the migration object belongs in the target instance. &gt; You can invoke the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all ApsaraDB RDS instances in the specified region, including instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>transfer_test3</p>
         */
        public Builder dstDb(String dstDb) {
            this.putQueryParameter("DstDb", dstDb);
            this.dstDb = dstDb;
            return this;
        }

        /**
         * <p>The password of the privileged user for the destination ApsaraDB RDS instance. &gt; * The password must be 8 to 32 characters in length. * The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. * Special characters include ! @ # $ &amp; % ^ * ( ) _ + - =</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder dstPassword(String dstPassword) {
            this.putQueryParameter("DstPassword", dstPassword);
            this.dstPassword = dstPassword;
            return this;
        }

        /**
         * <p>The destination task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-zkrc1****l54rc</p>
         */
        public Builder dstResId(String dstResId) {
            this.putQueryParameter("DstResId", dstResId);
            this.dstResId = dstResId;
            return this;
        }

        /**
         * <p>The username used to connect to the target instance.</p>
         * 
         * <strong>example:</strong>
         * <p>bbt_item</p>
         */
        public Builder dstUserName(String dstUserName) {
            this.putQueryParameter("DstUserName", dstUserName);
            this.dstUserName = dstUserName;
            return this;
        }

        /**
         * <p>The region ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The switchover task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        public Builder slinkTaskId(String slinkTaskId) {
            this.putQueryParameter("SlinkTaskId", slinkTaskId);
            this.slinkTaskId = slinkTaskId;
            return this;
        }

        /**
         * <p>The password of the source ApsaraDB RDS instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including the password.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcPassword(String srcPassword) {
            this.putQueryParameter("SrcPassword", srcPassword);
            this.srcPassword = srcPassword;
            return this;
        }

        /**
         * <p>The username used to connect to the source instance (source database).</p>
         * 
         * <strong>example:</strong>
         * <p>bbt_ump</p>
         */
        public Builder srcUserName(String srcUserName) {
            this.putQueryParameter("SrcUserName", srcUserName);
            this.srcUserName = srcUserName;
            return this;
        }

        @Override
        public CreateRplInspectionTaskRequest build() {
            return new CreateRplInspectionTaskRequest(this);
        } 

    } 

}
