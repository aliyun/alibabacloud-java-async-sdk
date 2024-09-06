// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * DirectoryService.
         */
        public Builder directoryService(DirectoryService directoryService) {
            String directoryServiceShrink = shrink(directoryService, "DirectoryService", "json");
            this.putQueryParameter("DirectoryService", directoryServiceShrink);
            this.directoryService = directoryService;
            return this;
        }

        /**
         * EnableHT.
         */
        public Builder enableHT(Boolean enableHT) {
            this.putQueryParameter("EnableHT", enableHT);
            this.enableHT = enableHT;
            return this;
        }

        /**
         * HPCInterConnect.
         */
        public Builder HPCInterConnect(String HPCInterConnect) {
            this.putQueryParameter("HPCInterConnect", HPCInterConnect);
            this.HPCInterConnect = HPCInterConnect;
            return this;
        }

        /**
         * ImageOwnerAlias.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * IsPublic.
         */
        public Builder isPublic(Boolean isPublic) {
            this.putQueryParameter("IsPublic", isPublic);
            this.isPublic = isPublic;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Scheduler.
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
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
