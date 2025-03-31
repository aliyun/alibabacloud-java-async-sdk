// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreateAPSJobRequest} extends {@link RequestModel}
 *
 * <p>CreateAPSJobRequest</p>
 */
public class CreateAPSJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApsJobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apsJobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationEndpointInstanceID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointPassword")
    private String destinationEndpointPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointUserName")
    private String destinationEndpointUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartitionList")
    private String partitionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceEndpointInstanceID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceEndpointPassword")
    private String sourceEndpointPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceEndpointUserName")
    private String sourceEndpointUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetTableMode")
    private String targetTableMode;

    private CreateAPSJobRequest(Builder builder) {
        super(builder);
        this.apsJobName = builder.apsJobName;
        this.dbList = builder.dbList;
        this.destinationEndpointInstanceID = builder.destinationEndpointInstanceID;
        this.destinationEndpointPassword = builder.destinationEndpointPassword;
        this.destinationEndpointUserName = builder.destinationEndpointUserName;
        this.partitionList = builder.partitionList;
        this.regionId = builder.regionId;
        this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
        this.sourceEndpointPassword = builder.sourceEndpointPassword;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.sourceEndpointUserName = builder.sourceEndpointUserName;
        this.targetTableMode = builder.targetTableMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAPSJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apsJobName
     */
    public String getApsJobName() {
        return this.apsJobName;
    }

    /**
     * @return dbList
     */
    public String getDbList() {
        return this.dbList;
    }

    /**
     * @return destinationEndpointInstanceID
     */
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    /**
     * @return destinationEndpointPassword
     */
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    /**
     * @return destinationEndpointUserName
     */
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    /**
     * @return partitionList
     */
    public String getPartitionList() {
        return this.partitionList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceEndpointInstanceID
     */
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    /**
     * @return sourceEndpointPassword
     */
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    /**
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    /**
     * @return sourceEndpointUserName
     */
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    /**
     * @return targetTableMode
     */
    public String getTargetTableMode() {
        return this.targetTableMode;
    }

    public static final class Builder extends Request.Builder<CreateAPSJobRequest, Builder> {
        private String apsJobName; 
        private String dbList; 
        private String destinationEndpointInstanceID; 
        private String destinationEndpointPassword; 
        private String destinationEndpointUserName; 
        private String partitionList; 
        private String regionId; 
        private String sourceEndpointInstanceID; 
        private String sourceEndpointPassword; 
        private String sourceEndpointRegion; 
        private String sourceEndpointUserName; 
        private String targetTableMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateAPSJobRequest request) {
            super(request);
            this.apsJobName = request.apsJobName;
            this.dbList = request.dbList;
            this.destinationEndpointInstanceID = request.destinationEndpointInstanceID;
            this.destinationEndpointPassword = request.destinationEndpointPassword;
            this.destinationEndpointUserName = request.destinationEndpointUserName;
            this.partitionList = request.partitionList;
            this.regionId = request.regionId;
            this.sourceEndpointInstanceID = request.sourceEndpointInstanceID;
            this.sourceEndpointPassword = request.sourceEndpointPassword;
            this.sourceEndpointRegion = request.sourceEndpointRegion;
            this.sourceEndpointUserName = request.sourceEndpointUserName;
            this.targetTableMode = request.targetTableMode;
        } 

        /**
         * <p>The name of the synchronization job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aps-xxxxx</p>
         */
        public Builder apsJobName(String apsJobName) {
            this.putBodyParameter("ApsJobName", apsJobName);
            this.apsJobName = apsJobName;
            return this;
        }

        /**
         * <p>The objects to be synchronized.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EntireInstance&quot;:true}</p>
         */
        public Builder dbList(String dbList) {
            this.putBodyParameter("DbList", dbList);
            this.dbList = dbList;
            return this;
        }

        /**
         * <p>The name of the database account of the destination cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-xxxxx</p>
         */
        public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
            this.putBodyParameter("DestinationEndpointInstanceID", destinationEndpointInstanceID);
            this.destinationEndpointInstanceID = destinationEndpointInstanceID;
            return this;
        }

        /**
         * <p>The password of the database account of the destination cluster.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder destinationEndpointPassword(String destinationEndpointPassword) {
            this.putBodyParameter("DestinationEndpointPassword", destinationEndpointPassword);
            this.destinationEndpointPassword = destinationEndpointPassword;
            return this;
        }

        /**
         * <p>The name of the database account of the destination cluster.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder destinationEndpointUserName(String destinationEndpointUserName) {
            this.putBodyParameter("DestinationEndpointUserName", destinationEndpointUserName);
            this.destinationEndpointUserName = destinationEndpointUserName;
            return this;
        }

        /**
         * <p>The partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder partitionList(String partitionList) {
            this.putBodyParameter("PartitionList", partitionList);
            this.partitionList = partitionList;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the source instance or cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxxxx</p>
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putBodyParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * <p>The password of the database account of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putBodyParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * <p>The region ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putBodyParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * <p>The name of the database account of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putBodyParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        /**
         * <p>The mode of the destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder targetTableMode(String targetTableMode) {
            this.putBodyParameter("TargetTableMode", targetTableMode);
            this.targetTableMode = targetTableMode;
            return this;
        }

        @Override
        public CreateAPSJobRequest build() {
            return new CreateAPSJobRequest(this);
        } 

    } 

}
