// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link ListAvailableImagesRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableImagesRequest</p>
 */
public class ListAvailableImagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryService")
    private DirectoryService directoryService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableHT")
    private Boolean enableHT;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HPCInterConnect")
    private String HPCInterConnect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPublic")
    private Boolean isPublic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private Scheduler scheduler;

    private ListAvailableImagesRequest(Builder builder) {
        super(builder);
        this.directoryService = builder.directoryService;
        this.enableHT = builder.enableHT;
        this.HPCInterConnect = builder.HPCInterConnect;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.instanceType = builder.instanceType;
        this.isPublic = builder.isPublic;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scheduler = builder.scheduler;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryService
     */
    public DirectoryService getDirectoryService() {
        return this.directoryService;
    }

    /**
     * @return enableHT
     */
    public Boolean getEnableHT() {
        return this.enableHT;
    }

    /**
     * @return HPCInterConnect
     */
    public String getHPCInterConnect() {
        return this.HPCInterConnect;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scheduler
     */
    public Scheduler getScheduler() {
        return this.scheduler;
    }

    public static final class Builder extends Request.Builder<ListAvailableImagesRequest, Builder> {
        private DirectoryService directoryService; 
        private Boolean enableHT; 
        private String HPCInterConnect; 
        private String imageOwnerAlias; 
        private String instanceType; 
        private Boolean isPublic; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Scheduler scheduler; 

        private Builder() {
            super();
        } 

        private Builder(ListAvailableImagesRequest request) {
            super(request);
            this.directoryService = request.directoryService;
            this.enableHT = request.enableHT;
            this.HPCInterConnect = request.HPCInterConnect;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.instanceType = request.instanceType;
            this.isPublic = request.isPublic;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scheduler = request.scheduler;
        } 

        /**
         * <p>The information about the domain account service.</p>
         */
        public Builder directoryService(DirectoryService directoryService) {
            String directoryServiceShrink = shrink(directoryService, "DirectoryService", "json");
            this.putQueryParameter("DirectoryService", directoryServiceShrink);
            this.directoryService = directoryService;
            return this;
        }

        /**
         * <p>Specifies whether to return images in which hyper-threading is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableHT(Boolean enableHT) {
            this.putQueryParameter("EnableHT", enableHT);
            this.enableHT = enableHT;
            return this;
        }

        /**
         * <p>The network type of the images that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder HPCInterConnect(String HPCInterConnect) {
            this.putQueryParameter("HPCInterConnect", HPCInterConnect);
            this.HPCInterConnect = HPCInterConnect;
            return this;
        }

        /**
         * <p>The image source. Valid values:</p>
         * <ul>
         * <li>system: system image.</li>
         * <li>self: custom image.</li>
         * <li>others: shared image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>self</p>
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * <blockquote>
         * <p> By default, if you do not specify an instance type, the list of images that are supported by all instance types are queried. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.c7.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Specifies whether to return published community images. Valid values:</p>
         * <ul>
         * <li>true: returns published community images. If you set the value of this parameter to <code>true</code>, the <code>ImageOwnerAlias</code> parameter must be set to <code>others</code>.</li>
         * <li>false: returns non-community images. The value of the <code>ImageOwnerAlias</code> parameter prevails.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isPublic(Boolean isPublic) {
            this.putQueryParameter("IsPublic", isPublic);
            this.isPublic = isPublic;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The scheduler information about the images that you want to query.</p>
         */
        public Builder scheduler(Scheduler scheduler) {
            String schedulerShrink = shrink(scheduler, "Scheduler", "json");
            this.putQueryParameter("Scheduler", schedulerShrink);
            this.scheduler = scheduler;
            return this;
        }

        @Override
        public ListAvailableImagesRequest build() {
            return new ListAvailableImagesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAvailableImagesRequest} extends {@link TeaModel}
     *
     * <p>ListAvailableImagesRequest</p>
     */
    public static class DirectoryService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DirectoryService(Builder builder) {
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryService create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String type; 
            private String version; 

            /**
             * <p>The type of the domain account.</p>
             * 
             * <strong>example:</strong>
             * <p>NIS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the domain account service.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DirectoryService build() {
                return new DirectoryService(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAvailableImagesRequest} extends {@link TeaModel}
     *
     * <p>ListAvailableImagesRequest</p>
     */
    public static class Scheduler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Scheduler(Builder builder) {
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scheduler create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String type; 
            private String version; 

            /**
             * <p>The scheduler type.</p>
             * 
             * <strong>example:</strong>
             * <p>SLURM</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The scheduler version.</p>
             * 
             * <strong>example:</strong>
             * <p>22.05.8</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Scheduler build() {
                return new Scheduler(this);
            } 

        } 

    }
}
