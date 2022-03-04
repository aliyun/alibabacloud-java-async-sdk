// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommandsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommandsRequest</p>
 */
public class DescribeCommandsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("CommandId")
    private String commandId;

    @Query
    @NameInMap("Provider")
    private String provider;

    @Query
    @NameInMap("ContentEncoding")
    private String contentEncoding;

    private DescribeCommandsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.name = builder.name;
        this.type = builder.type;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.commandId = builder.commandId;
        this.provider = builder.provider;
        this.contentEncoding = builder.contentEncoding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommandsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public static final class Builder extends Request.Builder<DescribeCommandsRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String description; 
        private String name; 
        private String type; 
        private Long pageNumber; 
        private Long pageSize; 
        private String commandId; 
        private String provider; 
        private String contentEncoding; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommandsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.description = request.description;
            this.name = request.name;
            this.type = request.type;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.commandId = request.commandId;
            this.provider = request.provider;
            this.contentEncoding = request.contentEncoding;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description of the command.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the command. Fuzzy query is not supported.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The type of the command. Valid values:
         * <p>
         * 
         * -RunBatScript: The Bat script that runs in the Windows instance.
         * -RunPowerShellScript: The command is the Windows script that runs in the PowerShell instance.
         * -RunShellScript: The command is a Shell script that runs on a Linux instance.
         * 
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The current page number.
         * <p>
         * 
         * The start value is 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 50.
         * 
         * Default value: 10.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the command.
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * The provider of public commands. The parameter values are described as follows:
         * <p>
         * 
         * -If this parameter is not set, all manually created cloud assistant commands are queried by default.
         * -If this parameter is set to "AlibabaCloud", all public commands provided by Alibaba Cloud are queried.
         * -If the value of this parameter is a specific public Command provider, query all public commands provided by the provider. Example:
         * -When "Provider = AlibabaCloud.ECS.GuestOS", query the public commands provided by "AlibabaCloud.ECS.GuestOS.
         * -When "Provider = AlibabaCloud.ECS.GuestOSDiagnose", query the public commands provided by "AlibabaCloud.ECS.GuestOSDiagnose.
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * Specifies the encoding method of the "CommandContent" and "Output" fields in the returned data. Valid values:
         * <p>
         * -PlainText: returns the original script content and output information.
         * -Base64: returns the base64-encoded script content and output information.
         * 
         * The default value is base64.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        @Override
        public DescribeCommandsRequest build() {
            return new DescribeCommandsRequest(this);
        } 

    } 

}
