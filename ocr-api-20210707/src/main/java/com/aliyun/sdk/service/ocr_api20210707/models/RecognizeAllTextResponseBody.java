// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
 *
 * <p>RecognizeAllTextResponseBody</p>
 */
public class RecognizeAllTextResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private RecognizeAllTextResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeAllTextResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RecognizeAllTextResponseBody build() {
            return new RecognizeAllTextResponseBody(this);
        } 

    } 

    public static class BarCodePoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private BarCodePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public BarCodePoints build() {
                return new BarCodePoints(this);
            } 

        } 

    }
    public static class BarCodeRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private BarCodeRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodeRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public BarCodeRect build() {
                return new BarCodeRect(this);
            } 

        } 

    }
    public static class BarCodeDetails extends TeaModel {
        @NameInMap("BarCodeAngle")
        private Integer barCodeAngle;

        @NameInMap("BarCodePoints")
        private java.util.List < BarCodePoints> barCodePoints;

        @NameInMap("BarCodeRect")
        private BarCodeRect barCodeRect;

        @NameInMap("Data")
        private Object data;

        @NameInMap("Type")
        private String type;

        private BarCodeDetails(Builder builder) {
            this.barCodeAngle = builder.barCodeAngle;
            this.barCodePoints = builder.barCodePoints;
            this.barCodeRect = builder.barCodeRect;
            this.data = builder.data;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodeDetails create() {
            return builder().build();
        }

        /**
         * @return barCodeAngle
         */
        public Integer getBarCodeAngle() {
            return this.barCodeAngle;
        }

        /**
         * @return barCodePoints
         */
        public java.util.List < BarCodePoints> getBarCodePoints() {
            return this.barCodePoints;
        }

        /**
         * @return barCodeRect
         */
        public BarCodeRect getBarCodeRect() {
            return this.barCodeRect;
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer barCodeAngle; 
            private java.util.List < BarCodePoints> barCodePoints; 
            private BarCodeRect barCodeRect; 
            private Object data; 
            private String type; 

            /**
             * BarCodeAngle.
             */
            public Builder barCodeAngle(Integer barCodeAngle) {
                this.barCodeAngle = barCodeAngle;
                return this;
            }

            /**
             * BarCodePoints.
             */
            public Builder barCodePoints(java.util.List < BarCodePoints> barCodePoints) {
                this.barCodePoints = barCodePoints;
                return this;
            }

            /**
             * BarCodeRect.
             */
            public Builder barCodeRect(BarCodeRect barCodeRect) {
                this.barCodeRect = barCodeRect;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BarCodeDetails build() {
                return new BarCodeDetails(this);
            } 

        } 

    }
    public static class BarCodeInfo extends TeaModel {
        @NameInMap("BarCodeCount")
        private Integer barCodeCount;

        @NameInMap("BarCodeDetails")
        private java.util.List < BarCodeDetails> barCodeDetails;

        private BarCodeInfo(Builder builder) {
            this.barCodeCount = builder.barCodeCount;
            this.barCodeDetails = builder.barCodeDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodeInfo create() {
            return builder().build();
        }

        /**
         * @return barCodeCount
         */
        public Integer getBarCodeCount() {
            return this.barCodeCount;
        }

        /**
         * @return barCodeDetails
         */
        public java.util.List < BarCodeDetails> getBarCodeDetails() {
            return this.barCodeDetails;
        }

        public static final class Builder {
            private Integer barCodeCount; 
            private java.util.List < BarCodeDetails> barCodeDetails; 

            /**
             * BarCodeCount.
             */
            public Builder barCodeCount(Integer barCodeCount) {
                this.barCodeCount = barCodeCount;
                return this;
            }

            /**
             * BarCodeDetails.
             */
            public Builder barCodeDetails(java.util.List < BarCodeDetails> barCodeDetails) {
                this.barCodeDetails = barCodeDetails;
                return this;
            }

            public BarCodeInfo build() {
                return new BarCodeInfo(this);
            } 

        } 

    }
    public static class BlockPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private BlockPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public BlockPoints build() {
                return new BlockPoints(this);
            } 

        } 

    }
    public static class BlockRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private BlockRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public BlockRect build() {
                return new BlockRect(this);
            } 

        } 

    }
    public static class CharPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private CharPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public CharPoints build() {
                return new CharPoints(this);
            } 

        } 

    }
    public static class CharRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private CharRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public CharRect build() {
                return new CharRect(this);
            } 

        } 

    }
    public static class CharInfos extends TeaModel {
        @NameInMap("CharConfidence")
        private Integer charConfidence;

        @NameInMap("CharContent")
        private String charContent;

        @NameInMap("CharId")
        private Integer charId;

        @NameInMap("CharPoints")
        private java.util.List < CharPoints> charPoints;

        @NameInMap("CharRect")
        private CharRect charRect;

        private CharInfos(Builder builder) {
            this.charConfidence = builder.charConfidence;
            this.charContent = builder.charContent;
            this.charId = builder.charId;
            this.charPoints = builder.charPoints;
            this.charRect = builder.charRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharInfos create() {
            return builder().build();
        }

        /**
         * @return charConfidence
         */
        public Integer getCharConfidence() {
            return this.charConfidence;
        }

        /**
         * @return charContent
         */
        public String getCharContent() {
            return this.charContent;
        }

        /**
         * @return charId
         */
        public Integer getCharId() {
            return this.charId;
        }

        /**
         * @return charPoints
         */
        public java.util.List < CharPoints> getCharPoints() {
            return this.charPoints;
        }

        /**
         * @return charRect
         */
        public CharRect getCharRect() {
            return this.charRect;
        }

        public static final class Builder {
            private Integer charConfidence; 
            private String charContent; 
            private Integer charId; 
            private java.util.List < CharPoints> charPoints; 
            private CharRect charRect; 

            /**
             * CharConfidence.
             */
            public Builder charConfidence(Integer charConfidence) {
                this.charConfidence = charConfidence;
                return this;
            }

            /**
             * CharContent.
             */
            public Builder charContent(String charContent) {
                this.charContent = charContent;
                return this;
            }

            /**
             * CharId.
             */
            public Builder charId(Integer charId) {
                this.charId = charId;
                return this;
            }

            /**
             * CharPoints.
             */
            public Builder charPoints(java.util.List < CharPoints> charPoints) {
                this.charPoints = charPoints;
                return this;
            }

            /**
             * CharRect.
             */
            public Builder charRect(CharRect charRect) {
                this.charRect = charRect;
                return this;
            }

            public CharInfos build() {
                return new CharInfos(this);
            } 

        } 

    }
    public static class BlockDetails extends TeaModel {
        @NameInMap("BlockAngle")
        private Integer blockAngle;

        @NameInMap("BlockConfidence")
        private Integer blockConfidence;

        @NameInMap("BlockContent")
        private String blockContent;

        @NameInMap("BlockId")
        private Integer blockId;

        @NameInMap("BlockPoints")
        private java.util.List < BlockPoints> blockPoints;

        @NameInMap("BlockRect")
        private BlockRect blockRect;

        @NameInMap("CharInfos")
        private java.util.List < CharInfos> charInfos;

        private BlockDetails(Builder builder) {
            this.blockAngle = builder.blockAngle;
            this.blockConfidence = builder.blockConfidence;
            this.blockContent = builder.blockContent;
            this.blockId = builder.blockId;
            this.blockPoints = builder.blockPoints;
            this.blockRect = builder.blockRect;
            this.charInfos = builder.charInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockDetails create() {
            return builder().build();
        }

        /**
         * @return blockAngle
         */
        public Integer getBlockAngle() {
            return this.blockAngle;
        }

        /**
         * @return blockConfidence
         */
        public Integer getBlockConfidence() {
            return this.blockConfidence;
        }

        /**
         * @return blockContent
         */
        public String getBlockContent() {
            return this.blockContent;
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return blockPoints
         */
        public java.util.List < BlockPoints> getBlockPoints() {
            return this.blockPoints;
        }

        /**
         * @return blockRect
         */
        public BlockRect getBlockRect() {
            return this.blockRect;
        }

        /**
         * @return charInfos
         */
        public java.util.List < CharInfos> getCharInfos() {
            return this.charInfos;
        }

        public static final class Builder {
            private Integer blockAngle; 
            private Integer blockConfidence; 
            private String blockContent; 
            private Integer blockId; 
            private java.util.List < BlockPoints> blockPoints; 
            private BlockRect blockRect; 
            private java.util.List < CharInfos> charInfos; 

            /**
             * BlockAngle.
             */
            public Builder blockAngle(Integer blockAngle) {
                this.blockAngle = blockAngle;
                return this;
            }

            /**
             * BlockConfidence.
             */
            public Builder blockConfidence(Integer blockConfidence) {
                this.blockConfidence = blockConfidence;
                return this;
            }

            /**
             * BlockContent.
             */
            public Builder blockContent(String blockContent) {
                this.blockContent = blockContent;
                return this;
            }

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * BlockPoints.
             */
            public Builder blockPoints(java.util.List < BlockPoints> blockPoints) {
                this.blockPoints = blockPoints;
                return this;
            }

            /**
             * BlockRect.
             */
            public Builder blockRect(BlockRect blockRect) {
                this.blockRect = blockRect;
                return this;
            }

            /**
             * CharInfos.
             */
            public Builder charInfos(java.util.List < CharInfos> charInfos) {
                this.charInfos = charInfos;
                return this;
            }

            public BlockDetails build() {
                return new BlockDetails(this);
            } 

        } 

    }
    public static class BlockInfo extends TeaModel {
        @NameInMap("BlockCount")
        private Integer blockCount;

        @NameInMap("BlockDetails")
        private java.util.List < BlockDetails> blockDetails;

        private BlockInfo(Builder builder) {
            this.blockCount = builder.blockCount;
            this.blockDetails = builder.blockDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockInfo create() {
            return builder().build();
        }

        /**
         * @return blockCount
         */
        public Integer getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return blockDetails
         */
        public java.util.List < BlockDetails> getBlockDetails() {
            return this.blockDetails;
        }

        public static final class Builder {
            private Integer blockCount; 
            private java.util.List < BlockDetails> blockDetails; 

            /**
             * BlockCount.
             */
            public Builder blockCount(Integer blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * BlockDetails.
             */
            public Builder blockDetails(java.util.List < BlockDetails> blockDetails) {
                this.blockDetails = blockDetails;
                return this;
            }

            public BlockInfo build() {
                return new BlockInfo(this);
            } 

        } 

    }
    public static class KvInfo extends TeaModel {
        @NameInMap("Data")
        private Object data;

        @NameInMap("KvCount")
        private Integer kvCount;

        @NameInMap("KvDetails")
        private java.util.Map < String, DataSubImagesKvInfoKvDetailsValue > kvDetails;

        private KvInfo(Builder builder) {
            this.data = builder.data;
            this.kvCount = builder.kvCount;
            this.kvDetails = builder.kvDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KvInfo create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return kvCount
         */
        public Integer getKvCount() {
            return this.kvCount;
        }

        /**
         * @return kvDetails
         */
        public java.util.Map < String, DataSubImagesKvInfoKvDetailsValue > getKvDetails() {
            return this.kvDetails;
        }

        public static final class Builder {
            private Object data; 
            private Integer kvCount; 
            private java.util.Map < String, DataSubImagesKvInfoKvDetailsValue > kvDetails; 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * KvCount.
             */
            public Builder kvCount(Integer kvCount) {
                this.kvCount = kvCount;
                return this;
            }

            /**
             * KvDetails.
             */
            public Builder kvDetails(java.util.Map < String, DataSubImagesKvInfoKvDetailsValue > kvDetails) {
                this.kvDetails = kvDetails;
                return this;
            }

            public KvInfo build() {
                return new KvInfo(this);
            } 

        } 

    }
    public static class ParagraphDetails extends TeaModel {
        @NameInMap("BlockList")
        private java.util.List < Integer > blockList;

        @NameInMap("ParagraphContent")
        private String paragraphContent;

        @NameInMap("ParagraphId")
        private Integer paragraphId;

        private ParagraphDetails(Builder builder) {
            this.blockList = builder.blockList;
            this.paragraphContent = builder.paragraphContent;
            this.paragraphId = builder.paragraphId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParagraphDetails create() {
            return builder().build();
        }

        /**
         * @return blockList
         */
        public java.util.List < Integer > getBlockList() {
            return this.blockList;
        }

        /**
         * @return paragraphContent
         */
        public String getParagraphContent() {
            return this.paragraphContent;
        }

        /**
         * @return paragraphId
         */
        public Integer getParagraphId() {
            return this.paragraphId;
        }

        public static final class Builder {
            private java.util.List < Integer > blockList; 
            private String paragraphContent; 
            private Integer paragraphId; 

            /**
             * BlockList.
             */
            public Builder blockList(java.util.List < Integer > blockList) {
                this.blockList = blockList;
                return this;
            }

            /**
             * ParagraphContent.
             */
            public Builder paragraphContent(String paragraphContent) {
                this.paragraphContent = paragraphContent;
                return this;
            }

            /**
             * ParagraphId.
             */
            public Builder paragraphId(Integer paragraphId) {
                this.paragraphId = paragraphId;
                return this;
            }

            public ParagraphDetails build() {
                return new ParagraphDetails(this);
            } 

        } 

    }
    public static class ParagraphInfo extends TeaModel {
        @NameInMap("ParagraphCount")
        private Integer paragraphCount;

        @NameInMap("ParagraphDetails")
        private java.util.List < ParagraphDetails> paragraphDetails;

        private ParagraphInfo(Builder builder) {
            this.paragraphCount = builder.paragraphCount;
            this.paragraphDetails = builder.paragraphDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParagraphInfo create() {
            return builder().build();
        }

        /**
         * @return paragraphCount
         */
        public Integer getParagraphCount() {
            return this.paragraphCount;
        }

        /**
         * @return paragraphDetails
         */
        public java.util.List < ParagraphDetails> getParagraphDetails() {
            return this.paragraphDetails;
        }

        public static final class Builder {
            private Integer paragraphCount; 
            private java.util.List < ParagraphDetails> paragraphDetails; 

            /**
             * ParagraphCount.
             */
            public Builder paragraphCount(Integer paragraphCount) {
                this.paragraphCount = paragraphCount;
                return this;
            }

            /**
             * ParagraphDetails.
             */
            public Builder paragraphDetails(java.util.List < ParagraphDetails> paragraphDetails) {
                this.paragraphDetails = paragraphDetails;
                return this;
            }

            public ParagraphInfo build() {
                return new ParagraphInfo(this);
            } 

        } 

    }
    public static class QrCodePoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private QrCodePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public QrCodePoints build() {
                return new QrCodePoints(this);
            } 

        } 

    }
    public static class QrCodeRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private QrCodeRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodeRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public QrCodeRect build() {
                return new QrCodeRect(this);
            } 

        } 

    }
    public static class QrCodeDetails extends TeaModel {
        @NameInMap("Data")
        private Object data;

        @NameInMap("QrCodeAngle")
        private Integer qrCodeAngle;

        @NameInMap("QrCodePoints")
        private java.util.List < QrCodePoints> qrCodePoints;

        @NameInMap("QrCodeRect")
        private QrCodeRect qrCodeRect;

        private QrCodeDetails(Builder builder) {
            this.data = builder.data;
            this.qrCodeAngle = builder.qrCodeAngle;
            this.qrCodePoints = builder.qrCodePoints;
            this.qrCodeRect = builder.qrCodeRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodeDetails create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return qrCodeAngle
         */
        public Integer getQrCodeAngle() {
            return this.qrCodeAngle;
        }

        /**
         * @return qrCodePoints
         */
        public java.util.List < QrCodePoints> getQrCodePoints() {
            return this.qrCodePoints;
        }

        /**
         * @return qrCodeRect
         */
        public QrCodeRect getQrCodeRect() {
            return this.qrCodeRect;
        }

        public static final class Builder {
            private Object data; 
            private Integer qrCodeAngle; 
            private java.util.List < QrCodePoints> qrCodePoints; 
            private QrCodeRect qrCodeRect; 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * QrCodeAngle.
             */
            public Builder qrCodeAngle(Integer qrCodeAngle) {
                this.qrCodeAngle = qrCodeAngle;
                return this;
            }

            /**
             * QrCodePoints.
             */
            public Builder qrCodePoints(java.util.List < QrCodePoints> qrCodePoints) {
                this.qrCodePoints = qrCodePoints;
                return this;
            }

            /**
             * QrCodeRect.
             */
            public Builder qrCodeRect(QrCodeRect qrCodeRect) {
                this.qrCodeRect = qrCodeRect;
                return this;
            }

            public QrCodeDetails build() {
                return new QrCodeDetails(this);
            } 

        } 

    }
    public static class QrCodeInfo extends TeaModel {
        @NameInMap("QrCodeCount")
        private Integer qrCodeCount;

        @NameInMap("QrCodeDetails")
        private java.util.List < QrCodeDetails> qrCodeDetails;

        private QrCodeInfo(Builder builder) {
            this.qrCodeCount = builder.qrCodeCount;
            this.qrCodeDetails = builder.qrCodeDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodeInfo create() {
            return builder().build();
        }

        /**
         * @return qrCodeCount
         */
        public Integer getQrCodeCount() {
            return this.qrCodeCount;
        }

        /**
         * @return qrCodeDetails
         */
        public java.util.List < QrCodeDetails> getQrCodeDetails() {
            return this.qrCodeDetails;
        }

        public static final class Builder {
            private Integer qrCodeCount; 
            private java.util.List < QrCodeDetails> qrCodeDetails; 

            /**
             * QrCodeCount.
             */
            public Builder qrCodeCount(Integer qrCodeCount) {
                this.qrCodeCount = qrCodeCount;
                return this;
            }

            /**
             * QrCodeDetails.
             */
            public Builder qrCodeDetails(java.util.List < QrCodeDetails> qrCodeDetails) {
                this.qrCodeDetails = qrCodeDetails;
                return this;
            }

            public QrCodeInfo build() {
                return new QrCodeInfo(this);
            } 

        } 

    }
    public static class QualityInfo extends TeaModel {
        @NameInMap("CompletenessScore")
        private Float completenessScore;

        @NameInMap("IsCopy")
        private Boolean isCopy;

        @NameInMap("IsReshoot")
        private Boolean isReshoot;

        @NameInMap("QualityScore")
        private Float qualityScore;

        @NameInMap("TamperScore")
        private Float tamperScore;

        private QualityInfo(Builder builder) {
            this.completenessScore = builder.completenessScore;
            this.isCopy = builder.isCopy;
            this.isReshoot = builder.isReshoot;
            this.qualityScore = builder.qualityScore;
            this.tamperScore = builder.tamperScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityInfo create() {
            return builder().build();
        }

        /**
         * @return completenessScore
         */
        public Float getCompletenessScore() {
            return this.completenessScore;
        }

        /**
         * @return isCopy
         */
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        /**
         * @return isReshoot
         */
        public Boolean getIsReshoot() {
            return this.isReshoot;
        }

        /**
         * @return qualityScore
         */
        public Float getQualityScore() {
            return this.qualityScore;
        }

        /**
         * @return tamperScore
         */
        public Float getTamperScore() {
            return this.tamperScore;
        }

        public static final class Builder {
            private Float completenessScore; 
            private Boolean isCopy; 
            private Boolean isReshoot; 
            private Float qualityScore; 
            private Float tamperScore; 

            /**
             * CompletenessScore.
             */
            public Builder completenessScore(Float completenessScore) {
                this.completenessScore = completenessScore;
                return this;
            }

            /**
             * IsCopy.
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
                return this;
            }

            /**
             * IsReshoot.
             */
            public Builder isReshoot(Boolean isReshoot) {
                this.isReshoot = isReshoot;
                return this;
            }

            /**
             * QualityScore.
             */
            public Builder qualityScore(Float qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            /**
             * TamperScore.
             */
            public Builder tamperScore(Float tamperScore) {
                this.tamperScore = tamperScore;
                return this;
            }

            public QualityInfo build() {
                return new QualityInfo(this);
            } 

        } 

    }
    public static class RowDetails extends TeaModel {
        @NameInMap("BlockList")
        private java.util.List < Integer > blockList;

        @NameInMap("RowContent")
        private String rowContent;

        @NameInMap("RowId")
        private Integer rowId;

        private RowDetails(Builder builder) {
            this.blockList = builder.blockList;
            this.rowContent = builder.rowContent;
            this.rowId = builder.rowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowDetails create() {
            return builder().build();
        }

        /**
         * @return blockList
         */
        public java.util.List < Integer > getBlockList() {
            return this.blockList;
        }

        /**
         * @return rowContent
         */
        public String getRowContent() {
            return this.rowContent;
        }

        /**
         * @return rowId
         */
        public Integer getRowId() {
            return this.rowId;
        }

        public static final class Builder {
            private java.util.List < Integer > blockList; 
            private String rowContent; 
            private Integer rowId; 

            /**
             * BlockList.
             */
            public Builder blockList(java.util.List < Integer > blockList) {
                this.blockList = blockList;
                return this;
            }

            /**
             * RowContent.
             */
            public Builder rowContent(String rowContent) {
                this.rowContent = rowContent;
                return this;
            }

            /**
             * RowId.
             */
            public Builder rowId(Integer rowId) {
                this.rowId = rowId;
                return this;
            }

            public RowDetails build() {
                return new RowDetails(this);
            } 

        } 

    }
    public static class RowInfo extends TeaModel {
        @NameInMap("RowCount")
        private Integer rowCount;

        @NameInMap("RowDetails")
        private java.util.List < RowDetails> rowDetails;

        private RowInfo(Builder builder) {
            this.rowCount = builder.rowCount;
            this.rowDetails = builder.rowDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowInfo create() {
            return builder().build();
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return rowDetails
         */
        public java.util.List < RowDetails> getRowDetails() {
            return this.rowDetails;
        }

        public static final class Builder {
            private Integer rowCount; 
            private java.util.List < RowDetails> rowDetails; 

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * RowDetails.
             */
            public Builder rowDetails(java.util.List < RowDetails> rowDetails) {
                this.rowDetails = rowDetails;
                return this;
            }

            public RowInfo build() {
                return new RowInfo(this);
            } 

        } 

    }
    public static class StampDetailsData extends TeaModel {
        @NameInMap("AntiFakeCode")
        private String antiFakeCode;

        @NameInMap("CompanyId")
        private String companyId;

        @NameInMap("OrganizationName")
        private String organizationName;

        @NameInMap("OrganizationNameEng")
        private String organizationNameEng;

        @NameInMap("OtherText")
        private String otherText;

        @NameInMap("TaxpayerId")
        private String taxpayerId;

        @NameInMap("TopText")
        private String topText;

        private StampDetailsData(Builder builder) {
            this.antiFakeCode = builder.antiFakeCode;
            this.companyId = builder.companyId;
            this.organizationName = builder.organizationName;
            this.organizationNameEng = builder.organizationNameEng;
            this.otherText = builder.otherText;
            this.taxpayerId = builder.taxpayerId;
            this.topText = builder.topText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampDetailsData create() {
            return builder().build();
        }

        /**
         * @return antiFakeCode
         */
        public String getAntiFakeCode() {
            return this.antiFakeCode;
        }

        /**
         * @return companyId
         */
        public String getCompanyId() {
            return this.companyId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
        }

        /**
         * @return organizationNameEng
         */
        public String getOrganizationNameEng() {
            return this.organizationNameEng;
        }

        /**
         * @return otherText
         */
        public String getOtherText() {
            return this.otherText;
        }

        /**
         * @return taxpayerId
         */
        public String getTaxpayerId() {
            return this.taxpayerId;
        }

        /**
         * @return topText
         */
        public String getTopText() {
            return this.topText;
        }

        public static final class Builder {
            private String antiFakeCode; 
            private String companyId; 
            private String organizationName; 
            private String organizationNameEng; 
            private String otherText; 
            private String taxpayerId; 
            private String topText; 

            /**
             * AntiFakeCode.
             */
            public Builder antiFakeCode(String antiFakeCode) {
                this.antiFakeCode = antiFakeCode;
                return this;
            }

            /**
             * CompanyId.
             */
            public Builder companyId(String companyId) {
                this.companyId = companyId;
                return this;
            }

            /**
             * OrganizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
                return this;
            }

            /**
             * OrganizationNameEng.
             */
            public Builder organizationNameEng(String organizationNameEng) {
                this.organizationNameEng = organizationNameEng;
                return this;
            }

            /**
             * OtherText.
             */
            public Builder otherText(String otherText) {
                this.otherText = otherText;
                return this;
            }

            /**
             * TaxpayerId.
             */
            public Builder taxpayerId(String taxpayerId) {
                this.taxpayerId = taxpayerId;
                return this;
            }

            /**
             * TopText.
             */
            public Builder topText(String topText) {
                this.topText = topText;
                return this;
            }

            public StampDetailsData build() {
                return new StampDetailsData(this);
            } 

        } 

    }
    public static class StampPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private StampPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public StampPoints build() {
                return new StampPoints(this);
            } 

        } 

    }
    public static class StampRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private StampRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public StampRect build() {
                return new StampRect(this);
            } 

        } 

    }
    public static class StampDetails extends TeaModel {
        @NameInMap("Data")
        private StampDetailsData data;

        @NameInMap("StampAngle")
        private Integer stampAngle;

        @NameInMap("StampPoints")
        private java.util.List < StampPoints> stampPoints;

        @NameInMap("StampRect")
        private StampRect stampRect;

        private StampDetails(Builder builder) {
            this.data = builder.data;
            this.stampAngle = builder.stampAngle;
            this.stampPoints = builder.stampPoints;
            this.stampRect = builder.stampRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampDetails create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public StampDetailsData getData() {
            return this.data;
        }

        /**
         * @return stampAngle
         */
        public Integer getStampAngle() {
            return this.stampAngle;
        }

        /**
         * @return stampPoints
         */
        public java.util.List < StampPoints> getStampPoints() {
            return this.stampPoints;
        }

        /**
         * @return stampRect
         */
        public StampRect getStampRect() {
            return this.stampRect;
        }

        public static final class Builder {
            private StampDetailsData data; 
            private Integer stampAngle; 
            private java.util.List < StampPoints> stampPoints; 
            private StampRect stampRect; 

            /**
             * Data.
             */
            public Builder data(StampDetailsData data) {
                this.data = data;
                return this;
            }

            /**
             * StampAngle.
             */
            public Builder stampAngle(Integer stampAngle) {
                this.stampAngle = stampAngle;
                return this;
            }

            /**
             * StampPoints.
             */
            public Builder stampPoints(java.util.List < StampPoints> stampPoints) {
                this.stampPoints = stampPoints;
                return this;
            }

            /**
             * StampRect.
             */
            public Builder stampRect(StampRect stampRect) {
                this.stampRect = stampRect;
                return this;
            }

            public StampDetails build() {
                return new StampDetails(this);
            } 

        } 

    }
    public static class StampInfo extends TeaModel {
        @NameInMap("StampCount")
        private Integer stampCount;

        @NameInMap("StampDetails")
        private java.util.List < StampDetails> stampDetails;

        private StampInfo(Builder builder) {
            this.stampCount = builder.stampCount;
            this.stampDetails = builder.stampDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampInfo create() {
            return builder().build();
        }

        /**
         * @return stampCount
         */
        public Integer getStampCount() {
            return this.stampCount;
        }

        /**
         * @return stampDetails
         */
        public java.util.List < StampDetails> getStampDetails() {
            return this.stampDetails;
        }

        public static final class Builder {
            private Integer stampCount; 
            private java.util.List < StampDetails> stampDetails; 

            /**
             * StampCount.
             */
            public Builder stampCount(Integer stampCount) {
                this.stampCount = stampCount;
                return this;
            }

            /**
             * StampDetails.
             */
            public Builder stampDetails(java.util.List < StampDetails> stampDetails) {
                this.stampDetails = stampDetails;
                return this;
            }

            public StampInfo build() {
                return new StampInfo(this);
            } 

        } 

    }
    public static class SubImagePoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private SubImagePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImagePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public SubImagePoints build() {
                return new SubImagePoints(this);
            } 

        } 

    }
    public static class SubImageRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private SubImageRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImageRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public SubImageRect build() {
                return new SubImageRect(this);
            } 

        } 

    }
    public static class CellPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private CellPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public CellPoints build() {
                return new CellPoints(this);
            } 

        } 

    }
    public static class CellRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private CellRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public CellRect build() {
                return new CellRect(this);
            } 

        } 

    }
    public static class CellDetails extends TeaModel {
        @NameInMap("BlockList")
        private java.util.List < Integer > blockList;

        @NameInMap("CellAngle")
        private Integer cellAngle;

        @NameInMap("CellContent")
        private String cellContent;

        @NameInMap("CellId")
        private Integer cellId;

        @NameInMap("CellPoints")
        private java.util.List < CellPoints> cellPoints;

        @NameInMap("CellRect")
        private CellRect cellRect;

        @NameInMap("ColumnEnd")
        private Integer columnEnd;

        @NameInMap("ColumnStart")
        private Integer columnStart;

        @NameInMap("RowEnd")
        private Integer rowEnd;

        @NameInMap("RowStart")
        private Integer rowStart;

        private CellDetails(Builder builder) {
            this.blockList = builder.blockList;
            this.cellAngle = builder.cellAngle;
            this.cellContent = builder.cellContent;
            this.cellId = builder.cellId;
            this.cellPoints = builder.cellPoints;
            this.cellRect = builder.cellRect;
            this.columnEnd = builder.columnEnd;
            this.columnStart = builder.columnStart;
            this.rowEnd = builder.rowEnd;
            this.rowStart = builder.rowStart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellDetails create() {
            return builder().build();
        }

        /**
         * @return blockList
         */
        public java.util.List < Integer > getBlockList() {
            return this.blockList;
        }

        /**
         * @return cellAngle
         */
        public Integer getCellAngle() {
            return this.cellAngle;
        }

        /**
         * @return cellContent
         */
        public String getCellContent() {
            return this.cellContent;
        }

        /**
         * @return cellId
         */
        public Integer getCellId() {
            return this.cellId;
        }

        /**
         * @return cellPoints
         */
        public java.util.List < CellPoints> getCellPoints() {
            return this.cellPoints;
        }

        /**
         * @return cellRect
         */
        public CellRect getCellRect() {
            return this.cellRect;
        }

        /**
         * @return columnEnd
         */
        public Integer getColumnEnd() {
            return this.columnEnd;
        }

        /**
         * @return columnStart
         */
        public Integer getColumnStart() {
            return this.columnStart;
        }

        /**
         * @return rowEnd
         */
        public Integer getRowEnd() {
            return this.rowEnd;
        }

        /**
         * @return rowStart
         */
        public Integer getRowStart() {
            return this.rowStart;
        }

        public static final class Builder {
            private java.util.List < Integer > blockList; 
            private Integer cellAngle; 
            private String cellContent; 
            private Integer cellId; 
            private java.util.List < CellPoints> cellPoints; 
            private CellRect cellRect; 
            private Integer columnEnd; 
            private Integer columnStart; 
            private Integer rowEnd; 
            private Integer rowStart; 

            /**
             * BlockList.
             */
            public Builder blockList(java.util.List < Integer > blockList) {
                this.blockList = blockList;
                return this;
            }

            /**
             * CellAngle.
             */
            public Builder cellAngle(Integer cellAngle) {
                this.cellAngle = cellAngle;
                return this;
            }

            /**
             * CellContent.
             */
            public Builder cellContent(String cellContent) {
                this.cellContent = cellContent;
                return this;
            }

            /**
             * CellId.
             */
            public Builder cellId(Integer cellId) {
                this.cellId = cellId;
                return this;
            }

            /**
             * CellPoints.
             */
            public Builder cellPoints(java.util.List < CellPoints> cellPoints) {
                this.cellPoints = cellPoints;
                return this;
            }

            /**
             * CellRect.
             */
            public Builder cellRect(CellRect cellRect) {
                this.cellRect = cellRect;
                return this;
            }

            /**
             * ColumnEnd.
             */
            public Builder columnEnd(Integer columnEnd) {
                this.columnEnd = columnEnd;
                return this;
            }

            /**
             * ColumnStart.
             */
            public Builder columnStart(Integer columnStart) {
                this.columnStart = columnStart;
                return this;
            }

            /**
             * RowEnd.
             */
            public Builder rowEnd(Integer rowEnd) {
                this.rowEnd = rowEnd;
                return this;
            }

            /**
             * RowStart.
             */
            public Builder rowStart(Integer rowStart) {
                this.rowStart = rowStart;
                return this;
            }

            public CellDetails build() {
                return new CellDetails(this);
            } 

        } 

    }
    public static class Footer extends TeaModel {
        @NameInMap("BlockId")
        private Integer blockId;

        @NameInMap("Contents")
        private java.util.List < String > contents;

        private Footer(Builder builder) {
            this.blockId = builder.blockId;
            this.contents = builder.contents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Footer create() {
            return builder().build();
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return contents
         */
        public java.util.List < String > getContents() {
            return this.contents;
        }

        public static final class Builder {
            private Integer blockId; 
            private java.util.List < String > contents; 

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * Contents.
             */
            public Builder contents(java.util.List < String > contents) {
                this.contents = contents;
                return this;
            }

            public Footer build() {
                return new Footer(this);
            } 

        } 

    }
    public static class TableDetailsHeader extends TeaModel {
        @NameInMap("BlockId")
        private Integer blockId;

        @NameInMap("Contents")
        private java.util.List < String > contents;

        private TableDetailsHeader(Builder builder) {
            this.blockId = builder.blockId;
            this.contents = builder.contents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetailsHeader create() {
            return builder().build();
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return contents
         */
        public java.util.List < String > getContents() {
            return this.contents;
        }

        public static final class Builder {
            private Integer blockId; 
            private java.util.List < String > contents; 

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * Contents.
             */
            public Builder contents(java.util.List < String > contents) {
                this.contents = contents;
                return this;
            }

            public TableDetailsHeader build() {
                return new TableDetailsHeader(this);
            } 

        } 

    }
    public static class TablePoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private TablePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public TablePoints build() {
                return new TablePoints(this);
            } 

        } 

    }
    public static class TableRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private TableRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public TableRect build() {
                return new TableRect(this);
            } 

        } 

    }
    public static class TableDetails extends TeaModel {
        @NameInMap("CellCount")
        private Integer cellCount;

        @NameInMap("CellDetails")
        private java.util.List < CellDetails> cellDetails;

        @NameInMap("ColumnCount")
        private Integer columnCount;

        @NameInMap("Footer")
        private Footer footer;

        @NameInMap("Header")
        private TableDetailsHeader header;

        @NameInMap("RowCount")
        private Integer rowCount;

        @NameInMap("TableId")
        private Integer tableId;

        @NameInMap("TablePoints")
        private java.util.List < TablePoints> tablePoints;

        @NameInMap("TableRect")
        private TableRect tableRect;

        private TableDetails(Builder builder) {
            this.cellCount = builder.cellCount;
            this.cellDetails = builder.cellDetails;
            this.columnCount = builder.columnCount;
            this.footer = builder.footer;
            this.header = builder.header;
            this.rowCount = builder.rowCount;
            this.tableId = builder.tableId;
            this.tablePoints = builder.tablePoints;
            this.tableRect = builder.tableRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetails create() {
            return builder().build();
        }

        /**
         * @return cellCount
         */
        public Integer getCellCount() {
            return this.cellCount;
        }

        /**
         * @return cellDetails
         */
        public java.util.List < CellDetails> getCellDetails() {
            return this.cellDetails;
        }

        /**
         * @return columnCount
         */
        public Integer getColumnCount() {
            return this.columnCount;
        }

        /**
         * @return footer
         */
        public Footer getFooter() {
            return this.footer;
        }

        /**
         * @return header
         */
        public TableDetailsHeader getHeader() {
            return this.header;
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return tableId
         */
        public Integer getTableId() {
            return this.tableId;
        }

        /**
         * @return tablePoints
         */
        public java.util.List < TablePoints> getTablePoints() {
            return this.tablePoints;
        }

        /**
         * @return tableRect
         */
        public TableRect getTableRect() {
            return this.tableRect;
        }

        public static final class Builder {
            private Integer cellCount; 
            private java.util.List < CellDetails> cellDetails; 
            private Integer columnCount; 
            private Footer footer; 
            private TableDetailsHeader header; 
            private Integer rowCount; 
            private Integer tableId; 
            private java.util.List < TablePoints> tablePoints; 
            private TableRect tableRect; 

            /**
             * CellCount.
             */
            public Builder cellCount(Integer cellCount) {
                this.cellCount = cellCount;
                return this;
            }

            /**
             * CellDetails.
             */
            public Builder cellDetails(java.util.List < CellDetails> cellDetails) {
                this.cellDetails = cellDetails;
                return this;
            }

            /**
             * ColumnCount.
             */
            public Builder columnCount(Integer columnCount) {
                this.columnCount = columnCount;
                return this;
            }

            /**
             * Footer.
             */
            public Builder footer(Footer footer) {
                this.footer = footer;
                return this;
            }

            /**
             * Header.
             */
            public Builder header(TableDetailsHeader header) {
                this.header = header;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * TableId.
             */
            public Builder tableId(Integer tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * TablePoints.
             */
            public Builder tablePoints(java.util.List < TablePoints> tablePoints) {
                this.tablePoints = tablePoints;
                return this;
            }

            /**
             * TableRect.
             */
            public Builder tableRect(TableRect tableRect) {
                this.tableRect = tableRect;
                return this;
            }

            public TableDetails build() {
                return new TableDetails(this);
            } 

        } 

    }
    public static class TableInfo extends TeaModel {
        @NameInMap("TableCount")
        private Integer tableCount;

        @NameInMap("TableDetails")
        private java.util.List < TableDetails> tableDetails;

        @NameInMap("TableExcel")
        private String tableExcel;

        @NameInMap("TableHtml")
        private String tableHtml;

        private TableInfo(Builder builder) {
            this.tableCount = builder.tableCount;
            this.tableDetails = builder.tableDetails;
            this.tableExcel = builder.tableExcel;
            this.tableHtml = builder.tableHtml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfo create() {
            return builder().build();
        }

        /**
         * @return tableCount
         */
        public Integer getTableCount() {
            return this.tableCount;
        }

        /**
         * @return tableDetails
         */
        public java.util.List < TableDetails> getTableDetails() {
            return this.tableDetails;
        }

        /**
         * @return tableExcel
         */
        public String getTableExcel() {
            return this.tableExcel;
        }

        /**
         * @return tableHtml
         */
        public String getTableHtml() {
            return this.tableHtml;
        }

        public static final class Builder {
            private Integer tableCount; 
            private java.util.List < TableDetails> tableDetails; 
            private String tableExcel; 
            private String tableHtml; 

            /**
             * TableCount.
             */
            public Builder tableCount(Integer tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * TableDetails.
             */
            public Builder tableDetails(java.util.List < TableDetails> tableDetails) {
                this.tableDetails = tableDetails;
                return this;
            }

            /**
             * TableExcel.
             */
            public Builder tableExcel(String tableExcel) {
                this.tableExcel = tableExcel;
                return this;
            }

            /**
             * TableHtml.
             */
            public Builder tableHtml(String tableHtml) {
                this.tableHtml = tableHtml;
                return this;
            }

            public TableInfo build() {
                return new TableInfo(this);
            } 

        } 

    }
    public static class SubImages extends TeaModel {
        @NameInMap("Angle")
        private Integer angle;

        @NameInMap("BarCodeInfo")
        private BarCodeInfo barCodeInfo;

        @NameInMap("BlockInfo")
        private BlockInfo blockInfo;

        @NameInMap("FigureInfo")
        private java.util.Map < String, DataSubImagesFigureInfoValue > figureInfo;

        @NameInMap("KvInfo")
        private KvInfo kvInfo;

        @NameInMap("ParagraphInfo")
        private ParagraphInfo paragraphInfo;

        @NameInMap("QrCodeInfo")
        private QrCodeInfo qrCodeInfo;

        @NameInMap("QualityInfo")
        private QualityInfo qualityInfo;

        @NameInMap("RowInfo")
        private RowInfo rowInfo;

        @NameInMap("StampInfo")
        private StampInfo stampInfo;

        @NameInMap("SubImageId")
        private Integer subImageId;

        @NameInMap("SubImagePoints")
        private java.util.List < SubImagePoints> subImagePoints;

        @NameInMap("SubImageRect")
        private SubImageRect subImageRect;

        @NameInMap("TableInfo")
        private TableInfo tableInfo;

        @NameInMap("Type")
        private String type;

        private SubImages(Builder builder) {
            this.angle = builder.angle;
            this.barCodeInfo = builder.barCodeInfo;
            this.blockInfo = builder.blockInfo;
            this.figureInfo = builder.figureInfo;
            this.kvInfo = builder.kvInfo;
            this.paragraphInfo = builder.paragraphInfo;
            this.qrCodeInfo = builder.qrCodeInfo;
            this.qualityInfo = builder.qualityInfo;
            this.rowInfo = builder.rowInfo;
            this.stampInfo = builder.stampInfo;
            this.subImageId = builder.subImageId;
            this.subImagePoints = builder.subImagePoints;
            this.subImageRect = builder.subImageRect;
            this.tableInfo = builder.tableInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImages create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Integer getAngle() {
            return this.angle;
        }

        /**
         * @return barCodeInfo
         */
        public BarCodeInfo getBarCodeInfo() {
            return this.barCodeInfo;
        }

        /**
         * @return blockInfo
         */
        public BlockInfo getBlockInfo() {
            return this.blockInfo;
        }

        /**
         * @return figureInfo
         */
        public java.util.Map < String, DataSubImagesFigureInfoValue > getFigureInfo() {
            return this.figureInfo;
        }

        /**
         * @return kvInfo
         */
        public KvInfo getKvInfo() {
            return this.kvInfo;
        }

        /**
         * @return paragraphInfo
         */
        public ParagraphInfo getParagraphInfo() {
            return this.paragraphInfo;
        }

        /**
         * @return qrCodeInfo
         */
        public QrCodeInfo getQrCodeInfo() {
            return this.qrCodeInfo;
        }

        /**
         * @return qualityInfo
         */
        public QualityInfo getQualityInfo() {
            return this.qualityInfo;
        }

        /**
         * @return rowInfo
         */
        public RowInfo getRowInfo() {
            return this.rowInfo;
        }

        /**
         * @return stampInfo
         */
        public StampInfo getStampInfo() {
            return this.stampInfo;
        }

        /**
         * @return subImageId
         */
        public Integer getSubImageId() {
            return this.subImageId;
        }

        /**
         * @return subImagePoints
         */
        public java.util.List < SubImagePoints> getSubImagePoints() {
            return this.subImagePoints;
        }

        /**
         * @return subImageRect
         */
        public SubImageRect getSubImageRect() {
            return this.subImageRect;
        }

        /**
         * @return tableInfo
         */
        public TableInfo getTableInfo() {
            return this.tableInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer angle; 
            private BarCodeInfo barCodeInfo; 
            private BlockInfo blockInfo; 
            private java.util.Map < String, DataSubImagesFigureInfoValue > figureInfo; 
            private KvInfo kvInfo; 
            private ParagraphInfo paragraphInfo; 
            private QrCodeInfo qrCodeInfo; 
            private QualityInfo qualityInfo; 
            private RowInfo rowInfo; 
            private StampInfo stampInfo; 
            private Integer subImageId; 
            private java.util.List < SubImagePoints> subImagePoints; 
            private SubImageRect subImageRect; 
            private TableInfo tableInfo; 
            private String type; 

            /**
             * Angle.
             */
            public Builder angle(Integer angle) {
                this.angle = angle;
                return this;
            }

            /**
             * BarCodeInfo.
             */
            public Builder barCodeInfo(BarCodeInfo barCodeInfo) {
                this.barCodeInfo = barCodeInfo;
                return this;
            }

            /**
             * BlockInfo.
             */
            public Builder blockInfo(BlockInfo blockInfo) {
                this.blockInfo = blockInfo;
                return this;
            }

            /**
             * FigureInfo.
             */
            public Builder figureInfo(java.util.Map < String, DataSubImagesFigureInfoValue > figureInfo) {
                this.figureInfo = figureInfo;
                return this;
            }

            /**
             * KvInfo.
             */
            public Builder kvInfo(KvInfo kvInfo) {
                this.kvInfo = kvInfo;
                return this;
            }

            /**
             * ParagraphInfo.
             */
            public Builder paragraphInfo(ParagraphInfo paragraphInfo) {
                this.paragraphInfo = paragraphInfo;
                return this;
            }

            /**
             * QrCodeInfo.
             */
            public Builder qrCodeInfo(QrCodeInfo qrCodeInfo) {
                this.qrCodeInfo = qrCodeInfo;
                return this;
            }

            /**
             * QualityInfo.
             */
            public Builder qualityInfo(QualityInfo qualityInfo) {
                this.qualityInfo = qualityInfo;
                return this;
            }

            /**
             * RowInfo.
             */
            public Builder rowInfo(RowInfo rowInfo) {
                this.rowInfo = rowInfo;
                return this;
            }

            /**
             * StampInfo.
             */
            public Builder stampInfo(StampInfo stampInfo) {
                this.stampInfo = stampInfo;
                return this;
            }

            /**
             * SubImageId.
             */
            public Builder subImageId(Integer subImageId) {
                this.subImageId = subImageId;
                return this;
            }

            /**
             * SubImagePoints.
             */
            public Builder subImagePoints(java.util.List < SubImagePoints> subImagePoints) {
                this.subImagePoints = subImagePoints;
                return this;
            }

            /**
             * SubImageRect.
             */
            public Builder subImageRect(SubImageRect subImageRect) {
                this.subImageRect = subImageRect;
                return this;
            }

            /**
             * TableInfo.
             */
            public Builder tableInfo(TableInfo tableInfo) {
                this.tableInfo = tableInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SubImages build() {
                return new SubImages(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AlgoServer")
        private java.util.List < String > algoServer;

        @NameInMap("AlgoVersion")
        private String algoVersion;

        @NameInMap("Content")
        private String content;

        @NameInMap("DebugInfo")
        private Object debugInfo;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("IsMixedMode")
        private Boolean isMixedMode;

        @NameInMap("KvExcelUrl")
        private String kvExcelUrl;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("SubImageCount")
        private Integer subImageCount;

        @NameInMap("SubImages")
        private java.util.List < SubImages> subImages;

        @NameInMap("Width")
        private Integer width;

        @NameInMap("XmlResult")
        private String xmlResult;

        private Data(Builder builder) {
            this.algoServer = builder.algoServer;
            this.algoVersion = builder.algoVersion;
            this.content = builder.content;
            this.debugInfo = builder.debugInfo;
            this.height = builder.height;
            this.isMixedMode = builder.isMixedMode;
            this.kvExcelUrl = builder.kvExcelUrl;
            this.pageNo = builder.pageNo;
            this.subImageCount = builder.subImageCount;
            this.subImages = builder.subImages;
            this.width = builder.width;
            this.xmlResult = builder.xmlResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algoServer
         */
        public java.util.List < String > getAlgoServer() {
            return this.algoServer;
        }

        /**
         * @return algoVersion
         */
        public String getAlgoVersion() {
            return this.algoVersion;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return debugInfo
         */
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return isMixedMode
         */
        public Boolean getIsMixedMode() {
            return this.isMixedMode;
        }

        /**
         * @return kvExcelUrl
         */
        public String getKvExcelUrl() {
            return this.kvExcelUrl;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return subImageCount
         */
        public Integer getSubImageCount() {
            return this.subImageCount;
        }

        /**
         * @return subImages
         */
        public java.util.List < SubImages> getSubImages() {
            return this.subImages;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        /**
         * @return xmlResult
         */
        public String getXmlResult() {
            return this.xmlResult;
        }

        public static final class Builder {
            private java.util.List < String > algoServer; 
            private String algoVersion; 
            private String content; 
            private Object debugInfo; 
            private Integer height; 
            private Boolean isMixedMode; 
            private String kvExcelUrl; 
            private Integer pageNo; 
            private Integer subImageCount; 
            private java.util.List < SubImages> subImages; 
            private Integer width; 
            private String xmlResult; 

            /**
             * AlgoServer.
             */
            public Builder algoServer(java.util.List < String > algoServer) {
                this.algoServer = algoServer;
                return this;
            }

            /**
             * AlgoVersion.
             */
            public Builder algoVersion(String algoVersion) {
                this.algoVersion = algoVersion;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DebugInfo.
             */
            public Builder debugInfo(Object debugInfo) {
                this.debugInfo = debugInfo;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * IsMixedMode.
             */
            public Builder isMixedMode(Boolean isMixedMode) {
                this.isMixedMode = isMixedMode;
                return this;
            }

            /**
             * KvExcelUrl.
             */
            public Builder kvExcelUrl(String kvExcelUrl) {
                this.kvExcelUrl = kvExcelUrl;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * SubImageCount.
             */
            public Builder subImageCount(Integer subImageCount) {
                this.subImageCount = subImageCount;
                return this;
            }

            /**
             * SubImages.
             */
            public Builder subImages(java.util.List < SubImages> subImages) {
                this.subImages = subImages;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            /**
             * XmlResult.
             */
            public Builder xmlResult(String xmlResult) {
                this.xmlResult = xmlResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
